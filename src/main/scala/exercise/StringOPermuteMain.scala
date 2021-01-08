package exercise

import scala.io.StdIn

object StringOPermuteMain {

  def main(args: Array[String]): Unit = {

    val numberOfWords = StdIn.readInt()

    for (i <- 1 to numberOfWords) {

      val letters: Array[Char] = StdIn.readLine.toArray
      val newLetters: Array[Char] = new Array[Char](letters.length)

      for (j <- letters.indices) {
        j match {
          case j: Int if (j % 2 == 0) =>
          case j: Int if (j % 2 != 0) => newLetters(j - 1) = letters(j); newLetters(j) = letters(j - 1)
        }
      }

      println(newLetters.mkString)
    }
  }

}
