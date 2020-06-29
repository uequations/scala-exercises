package exercise.function

import org.scalatest.{FlatSpec, Matchers}

class SumOfOddElementsFunctionTest extends FlatSpec with Matchers {

  behavior of "SumOfOddElementsFunctionTest"

  it should "apply" in {

    val testList: List[Int] = List(3, 2, 4, 6, 5, 7, 8, 0, 1)

    SumOfOddElementsFunction(testList) shouldEqual 16
  }

}
