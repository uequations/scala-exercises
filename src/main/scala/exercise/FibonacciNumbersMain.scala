package exercise

import scala.annotation.tailrec
import scala.io.StdIn


object FibonacciNumbersMain {

  @tailrec
  def fibonacci(x: Int, a: Int = 0, b: Int = 1): Int = x match {

    case 1 => a
    case 2 => b
    case _ => fibonacci(x - 1, b, a + b)
  }

  def main(args: Array[String]) {

    println(fibonacci(StdIn.readInt()))
  }
}
