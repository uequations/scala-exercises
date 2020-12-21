package exercise

import scala.io.StdIn

object PascalsTriangleMain {

  def main(args: Array[String]) {

    var prevRow: Array[Int] = new Array[Int](1)
    prevRow(0) = 1
    val rows: Int = StdIn.readInt()

    println(prevRow(0))

    for (i <- 2 to rows) {

      var currRow: Array[Int] = new Array[Int](i)

      for (j <- 1 to i) {
        if (j == 1) {
          print("1 ")
          currRow(0) = 1
        } else if (j == i) {
          println("1")
          currRow(i - 1) = 1
        } else {
          var value = prevRow(j - 2) + prevRow(j - 1)
          print(value + " ")
          currRow(j - 1) = value
        }
      }
      prevRow = currRow
    }
  }
}
