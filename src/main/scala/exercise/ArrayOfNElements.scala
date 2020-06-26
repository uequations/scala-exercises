object ArrayOfNElements extends App {

import scala.language.postfixOps

    def f(num:Int) : String = {
        val endNum = num - 1
        val list = 0 to endNum toList// Write your code here

        return list.mkString("[",", ","]")
    }

    val sc = new java.util.Scanner (System.in)
    var readInt = sc.nextInt 

    println(f(readInt))
}
