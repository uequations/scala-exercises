package exercise.function

import org.scalatest.{FlatSpec, Matchers}

class ListLengthTest extends FlatSpec with Matchers {

  behavior of "ListLengthTest"

  it should "apply" in {

    val testList: List[Int] = List(2, 5, 1, 4, 3, 7, 8, 6, 0, 9)
    ListLength(testList) shouldEqual 10
  }

}
