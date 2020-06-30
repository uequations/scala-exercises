package exercise.function

import org.scalatest.{FlatSpec, Matchers}

class UpdateListTest extends FlatSpec with Matchers {

  behavior of "UpdateListTest"

  it should "apply" in {
    val testList: List[Int] = List(2, -4, 3, -1, 23, -4, -54)

    UpdateList(testList) shouldEqual List(2, 4, 3, 1, 23, 4, 54)
  }

}
