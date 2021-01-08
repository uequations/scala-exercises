package exercise

import scala.io.StdIn

object StringMinglingMain {

  def main(args: String): Unit = {

    val stringP: Array[Char] = StdIn.readLine().toArray
    val stringQ: Array[Char] = StdIn.readLine().toArray

    val newString: StringBuilder = new StringBuilder()

    while (newString.size < stringP.length + stringQ.length) {

      val index = newString.size / 2

      newString.append(stringP(index))
      newString.append(stringQ(index))
    }

    println(newString.toString())
  }
}
