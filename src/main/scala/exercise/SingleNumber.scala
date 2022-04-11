package exercise

object SingleNumber {

  def singleNumber(nums: Array[Int]): Int = {
    val intMap = collection.mutable.Map[Int, Int]()

    for (i <- nums) {
      intMap += (i -> (intMap.getOrElse(i, 0) + 1))
    }

    for (i <- nums) {
      if (intMap(i) == 1) {
        return i
      }
    }
    0
  }
}
