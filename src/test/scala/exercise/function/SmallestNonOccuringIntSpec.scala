package exercise.function

import org.scalatest.{FlatSpec, Matchers}

class SmallestNonOccuringIntSpec extends FlatSpec with Matchers {

  behavior of "SmallestNonOccuringIntSpec"

  it should "apply-1" in {

    val intArray: Array[Int] = Array(1, 3, 6, 4, 1, 2)

    SmallestNonOccuringInt(intArray) shouldEqual 5
  }

  it should "apply-2" in {

    val intArray: Array[Int] = Array(1, 2, 3)

    SmallestNonOccuringInt(intArray) shouldEqual 4
  }

  it should "apply-3" in {

    val intArray: Array[Int] = Array(-1, -3)

    SmallestNonOccuringInt(intArray) shouldEqual 1
  }

}
