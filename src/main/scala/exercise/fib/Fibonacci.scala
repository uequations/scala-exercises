package exercise.fib

object Fibonacci {

  def main(args: Array[String]) = {
    println(s"factorial ${fib(5)}")
  }

  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, current: Int, next: Int): Int =
      if (n <= 0) current
      else go(n - 1, next, current + next)

    go(n, 0, 1)
  }
}
