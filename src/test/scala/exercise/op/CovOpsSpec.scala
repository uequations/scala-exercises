package exercise.op

import exercise.op
import exercise.operand.Cov
import org.scalatest.{FlatSpec, Matchers}

class CovOpsSpec extends FlatSpec with Matchers {

  behavior of "CovOps"

 it should "mergeableElementExists-1" in {

   val _coverages: List[Cov] = List(
     Cov(1, 20), Cov(21, 30), Cov(15, 25), Cov(28, 40), Cov(50, 60), Cov(61, 200))

   val coverage: Cov = Cov(1,20)

   CovOps.mergeableElementExists(_coverages,coverage) shouldBe true
 }

  it should "mergeableElementExists-2" in {

    val _coverages: List[Cov] = List(
      Cov(1, 20), Cov(21, 30), Cov(15, 25), Cov(28, 40), Cov(50, 60), Cov(61, 200))

    val coverage: Cov = Cov(250,300)

    CovOps.mergeableElementExists(_coverages,coverage) shouldBe false
  }

  it should "mergePair" in {

    val cov1: Cov = Cov(1,20)
    val cov2: Cov = Cov(21,30)

    CovOps.mergePair(cov1,cov2) shouldEqual Cov(1,30)
    CovOps.mergePair(cov2,cov1) shouldEqual Cov(1,30)
  }


  it should "range" in {

    val cov1: Cov = Cov(1,30)

    CovOps.range(cov1) shouldEqual 30
  }

  it should "shouldMerge-1" in {

    val cov1: Cov = Cov(1,20)
    val cov2: Cov = Cov(21,30)

    CovOps.shouldMerge(cov1,cov2) shouldBe true
    CovOps.shouldMerge(cov2,cov1) shouldBe true
  }

  it should "shouldMerge-2" in {

    val cov1: Cov = Cov(1,20)
    val cov2: Cov = Cov(15, 25)

    CovOps.shouldMerge(cov1,cov2) shouldBe true
    CovOps.shouldMerge(cov2,cov1) shouldBe true
  }

  it should "shouldMerge-3" in {

    val cov1: Cov = Cov(1,20)
    val cov2: Cov = Cov(28, 40)

    CovOps.shouldMerge(cov1,cov2) shouldBe false
    CovOps.shouldMerge(cov2,cov1) shouldBe false
  }

  it should "shouldMerge-4" in {

    val cov1: Cov = Cov(50,60)
    val cov2: Cov = Cov(61, 200)

    CovOps.shouldMerge(cov1,cov2) shouldBe true
    CovOps.shouldMerge(cov2,cov1) shouldBe true
  }

  it should "apply" in {

    val coverages: List[Cov] = List(
      Cov(21, 30), Cov(15, 25), Cov(28, 40), Cov(50, 60), Cov(61, 200))

    val coverage: Cov = Cov(1,20)

    op.CovOps(coverages,coverage) shouldEqual List(Cov(28,40), Cov(50,60), Cov(61,200), Cov(1,30))
  }
}
