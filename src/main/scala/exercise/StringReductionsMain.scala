package exercise

import scala.io.StdIn

object StringReductionsMain {

  def main(args: Array[String]) {

    val str = StdIn.readLine()

    val chars: StringBuilder = new StringBuilder

    str.foreach(c => {

      if (!chars.contains(c)) {
        chars.append(c)
      }
    })

    println(chars.toString())

  }
}
