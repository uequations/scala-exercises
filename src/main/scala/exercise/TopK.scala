package exercise

import scala.collection.mutable


// def getTopK(li: List[Int], k: Int): List[Int]


object TopK {

  def main(args: Array[String]): Unit = {

    val testInput = List(3, 4, 20, 9, 4, 6)

    val topK = getTopK(testInput, 3)

    println(topK)
  }


  def getTopK(li: List[Int], k: Int): List[Int] = {

    val newX = mutable.PriorityQueue[Int]()

    li.foreach((elem: Int) => {
      if (newX.size <= k || elem > newX.min)
        newX.enqueue(elem)
    })

    newX.toList
  }

}

