package exercise.function

object ListLength {

  def apply(arr: List[Int]): Int = {
    length(arr)
  }

  def length(list: List[Any]): Int = {
    var these = list
    var len = 0
    while (!these.isEmpty) {
      len += 1
      these = these.tail
    }
    len
  }
}
