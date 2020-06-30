package exercise.function

object UpdateList {
  def apply(intList: List[Int]): List[Int] = {
    intList.map(absValue)
  }

  def absValue(num: Int): Int = {
    if (num < 0) {
      num * (-1)
    } else {
      num
    }
  }
}
