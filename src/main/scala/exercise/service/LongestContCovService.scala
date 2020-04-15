package exercise.service

import exercise.op.CovOps
import exercise.operand.Cov
import org.slf4j.{Logger, LoggerFactory}

object LongestContCovService {

  val logger: Logger = LoggerFactory.getLogger("LongestContCovService");

  def apply(coverages: List[Cov]): Cov = {

    logger.info(s"coverages: ${coverages}")

    val filteredCoverages: List[Cov]  = coverages
      .filter { p: Cov => p.eff > 0 && p.eff < 366 }
      .filter { p: Cov => p.term > 0 && p.term < 366 }

      val nonOverlappingCoverages: List[Cov] = filteredCoverages.foldLeft[List[Cov]](filteredCoverages)(CovOps(_,_))

    logger.info(s"non-overlapping coverages: ${nonOverlappingCoverages}")

      nonOverlappingCoverages.maxBy[Int](CovOps.range)
  }
}
