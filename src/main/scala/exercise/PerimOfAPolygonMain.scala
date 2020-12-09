package exercise

import scala.io.StdIn

object PerimOfAPolygonMain {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val sidesNum: Int = StdIn.readLine().toInt
    var perimeter: Double = 0

    val coord0: Array[Int] = convertToCoordinates(StdIn.readLine().split(' '))
    var prevCoord: Array[Int] = coord0
    var curCoordStrings: Array[String] = new Array[String](2)
    var curCoord: Array[Int] = new Array[Int](2)

    for (i <- 1 until sidesNum) {

      curCoord = convertToCoordinates(StdIn.readLine().split(' '))
      perimeter = perimeter + computeDistance(curCoord, prevCoord)
      prevCoord = curCoord
    }

    println(perimeter + computeDistance(curCoord, coord0))
  }

  def convertToCoordinates(coordStrings: Array[String]): Array[Int] = {

    Array(coordStrings(0).toInt, coordStrings(1).toInt)
  }

  def computeDistance(coord1: Array[Int], coord2: Array[Int]): Double = {

    val sumOfSquares: Int = (coord1(0) - coord2(0)) * (coord1(0) - coord2(0)) + (coord1(1) - coord2(1)) * (coord1(1)
      - coord2(1))
    math.pow(sumOfSquares, 0.5)
  }
}
