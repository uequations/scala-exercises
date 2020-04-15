package exercise.service

import exercise.operand.Cov
import org.scalatest.{FlatSpec, Matchers}

class LongestContCovServiceSpec extends FlatSpec with Matchers {

  behavior of "LongestContCovServiceSpec"

  it should "apply-1" in {

    val coverages: List[Cov] = List(
      Cov(21, 30), Cov(15, 25), Cov(28, 40), Cov(50, 60), Cov(61, 200),Cov(1,20))

    LongestContCovService(coverages) shouldEqual Cov(50,200)
  }

  it should "apply-2" in {

    val coverages: List[Cov] = List(
      Cov(76, 156), Cov(77, 239), Cov(104, 263), Cov(146, 292), Cov(301, 340))

    LongestContCovService(coverages) shouldEqual Cov(76,292)
  }

  it should "apply-3" in {

    val coverages: List[Cov] = List(
      Cov(35, 47), Cov(67, 76), Cov(85, 108), Cov(107, 314), Cov(272, 328),Cov(303,348))

    LongestContCovService(coverages) shouldEqual Cov(85,348)
  }
}
