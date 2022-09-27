package exercise.topk

import scala.collection.mutable

object VerizonTopK {

  def main(args: Array[String]): Unit = {

    val testInput = List(3, 4, 20, 9, 4, 6)

    val topK = getTopK(testInput, 3)

    println(topK)
  }


  def getTopK(li: List[Int], k: Int): List[Int] = {

    var newX = mutable.Queue[Int]()

    li.foreach((elem: Int) => {
      newX.enqueue(elem)
      if (newX.size > k) {
        val hasToGo = newX.min
        newX = newX.filterNot(elem => elem == hasToGo)
      }
    })

    newX.toList
  }

}

