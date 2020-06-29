package exercise.function

import org.scalatest._

class ReverseAListFunctionTest extends FlatSpec with Matchers {

  "ReverseAListFunctionTest" should "apply" in {
    val testList: List[Int] = List(19, 22, 3, 28, 26, 17, 18, 4, 28, 0)
    ReverseAListFunction(testList) shouldEqual List(0, 28, 4, 18, 17, 26, 28, 3, 22, 19)
  }

}
