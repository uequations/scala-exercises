package exercise.op

import exercise.operand.Cov
import org.slf4j.{Logger, LoggerFactory}

object CovOps extends Ops[Cov] {

  val logger: Logger = LoggerFactory.getLogger("CovOps");

  override def mergePair(a: Cov, b: Cov): Cov = {
    (a, b) match {
      case (a: Cov, b: Cov) if !shouldMerge(a,b) => throw new IllegalArgumentException(s"Coverages ${a} and ${b} " +
        s"are not mergeable")
      case (a: Cov, b: Cov) if a.eff <= b.eff => Cov(a.eff, b.term)
      case (a: Cov, b: Cov) if a.eff > b.eff => Cov(b.eff, a.term)
      case _ => throw new IllegalArgumentException("Invalid input")
    }
  }

  override def range(item: Cov): Int = {
    item.term - item.eff + 1
  }

  override def shouldMerge(a: Cov, b: Cov): Boolean = {
    (a, b) match {
      case (a: Cov, b: Cov) if a.eff <= b.eff => a.term + 1 >= b.eff
      case (a: Cov, b: Cov) if a.eff > b.eff => b.term + 1 >= a.eff
      case _ => throw new IllegalArgumentException("Invalid input")
    }
  }

  override def mergeableElementExists(list: List[Cov], coverage: Cov): Boolean = {
    list.exists { p: Cov => shouldMerge(coverage, p) }
  }

  def apply(list: List[Cov], coverage: Cov): List[Cov] = {

    if (mergeableElementExists(list,coverage)){

      val completeList: List[Cov] = list :+ coverage

      val (mergeCandidates, otherCandidates) = completeList.partition {p: Cov =>shouldMerge(p,coverage)}

      logger.debug(s"merge candidates: ${mergeCandidates}")
      logger.debug(s"other candidates: ${otherCandidates}")

      val merged: Cov = Cov(mergeCandidates.minBy[Int] {f: Cov => f.eff}.eff,mergeCandidates.maxBy[Int]{f: Cov => f
        .term}.term)

      otherCandidates :+ merged
  } else {list}
  }
}
