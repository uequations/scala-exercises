package exercise.service

import exercise.operand.Cov
import org.scalatest.{FlatSpec, Matchers}

class LongestContCovServiceSpec extends FlatSpec with Matchers {

  behavior of "LongestContCovServiceSpec"

  it should "apply" in {

    val coverages: List[Cov] = List(
      Cov(21, 30), Cov(15, 25), Cov(28, 40), Cov(50, 60), Cov(61, 200),Cov(1,20))

    LongestContCovService(coverages) shouldEqual Cov(50,200)
  }

}
