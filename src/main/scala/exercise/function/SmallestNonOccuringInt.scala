package exercise.function

object SmallestNonOccuringInt {

  def apply(a: Array[Int]): Int = {

    val maxInt = if (a.max > 0) a.max else 1

    for (i <- 1 to maxInt) {
      if (!a.contains(i)) {
        return i
      }
    }

    a.max + 1
  }
}
