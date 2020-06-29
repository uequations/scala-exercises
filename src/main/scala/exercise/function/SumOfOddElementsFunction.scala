package exercise.function

object SumOfOddElementsFunction {

  def apply(arr: List[Int]): Int = {
    arr
      .filter(isOdd)
      .sum
  }

  def isOdd(a: Int): Boolean = {
    a % 2 != 0
  }
}
