package exercise

import scala.io.StdIn

object GCDMain {

  def main(args: Array[String]) = {
    acceptInputAndComputeGCD(new StringBuilder(StdIn.readLine()).split(' ').map(x => x.toInt).toList)
  }

  def acceptInputAndComputeGCD(pair: List[Int]) = {
    println(gcd(pair.head, pair.reverse.head))
  }

  def gcd(x: Int, y: Int): Int = y match {
    case 0 => x
    case n: Int => gcd(y, x % y)
  }
}
