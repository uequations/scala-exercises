package exercise.function

import org.scalatest.{FlatSpec, Matchers}

class Insert5DigitForMaxSpec extends FlatSpec with Matchers {

  behavior of "Insert5DigitForMaxSpec"

  it should "apply-268" in {

    val testInt: Int = 268

    Insert5DigitForMax(testInt) shouldEqual 5268
  }

  it should "apply-2428" in {

    val testInt: Int = 2428

    Insert5DigitForMax(testInt) shouldEqual 52428
  }

  it should "apply-69417" in {

    val testInt: Int = 69417

    Insert5DigitForMax(testInt) shouldEqual 695417
  }

  it should "apply-neg-8259" in {

    val testInt: Int = -8259
    Insert5DigitForMax(testInt) shouldEqual -82559
  }

  it should "apply-neg-37473" in {

    val testInt: Int = -37473
    Insert5DigitForMax(testInt) shouldEqual -357473
  }

  it should "apply-neg-3" in {

    val testInt: Int = -3
    Insert5DigitForMax(testInt) shouldEqual -35
  }

  it should "apply-3" in {

    val testInt: Int = 3
    Insert5DigitForMax(testInt) shouldEqual 53
  }

  it should "apply-0" in {

    val testInt: Int = 0
    Insert5DigitForMax(testInt) shouldEqual 50
  }
}
