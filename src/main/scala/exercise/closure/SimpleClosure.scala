package exercise.closure

object SimpleClosure {

  def main(args: Array[String]) = {
    val employeeNum = 50

    val simpleClosure = (name: String) => println(s"Company name is $name" + s" and total no. of employees are $employeeNum")

    def doIt(name: String) = {
      simpleClosure(name)
    }

    doIt("William")
  }
}
