package exercise.function

object Insert5DigitForMax {

  def apply(n: Int): Int = {

    val chars: StringBuilder = new StringBuilder(n.toString().asInstanceOf[String])

    val result = n match {
      case n: Int if n == 0 => 50
      case n: Int if n > 0 => solveForPositive(chars)
      case n: Int if n < 0 => solveForNegative(chars)
      case _ => throw new IllegalArgumentException("invalid input")
    }
    result
  }

  def solveForPositive(chars: StringBuilder): Int = {
    println("isPositive")

    var tmp = 0

    for (i <- chars.indices) {

      val asInt: Int = chars.charAt(i).toString.asInstanceOf[String].toInt
      if (asInt < 5) {
        println(chars.charAt(i))
        println(i)
        tmp = i
        return chars.insert(tmp, 5).toString().asInstanceOf[String].toInt
      }
    }
    chars.insert(0, 5).toString().asInstanceOf[String].toInt
  }

  def solveForNegative(chars: StringBuilder): Int = {
    println("isNegative")

    var tmp = 0

    for (i <- chars.indices) {

      val asChar: Char = chars.charAt(i)

      if (asChar.equals('-')) {} else {

        val asInt: Int = chars.charAt(i).toString.asInstanceOf[String].toInt
        if (asInt < 5) {
          println(chars.charAt(i))
          println(i)
          tmp = i
          return chars.insert(tmp + 1, 5).toString().asInstanceOf[String].toInt
        }
      }
    }
    chars.insert(0, 5).toString().asInstanceOf[String].toInt
  }
}
