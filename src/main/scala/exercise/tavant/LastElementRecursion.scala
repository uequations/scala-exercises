package exercise.tavant

object LastElementRecursion {

  def main(args: Array[String]): Unit = {

    val nums = List(2, 3, 7, 9, 10)

    println(s"Last element is ${solve(nums)}")
  }

  def solve(nums: List[Int]): Int = nums match {
    case a :: taila if taila.length > 0 => solve(taila)
    case b :: tailb => b
  }
}
