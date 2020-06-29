package exercise.function

object ReverseAListFunction {

  def apply(arr: List[Int]): List[Int] = {
    var result: List[Int] = Nil
    var these = arr
    while (these.nonEmpty) {
      result = these.head :: result
      these = these.tail
    }
    result
  }
}
