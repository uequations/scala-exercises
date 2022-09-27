package exercise.queue

import scala.collection.mutable

object QueuePractice {

  def main(args: Array[String]) = {
    var q1 = mutable.Queue(1, 2, 3, 4, 5)

    print("Queue Elements: ")

    q1.foreach((element: Int) => print(element + " "))

    var firstElement = q1.front
    println(s"\nFirst element in the queue: $firstElement")

    q1.enqueue(10)

    print("Queue elements after enqueue: ")
    q1.foreach((element: Int) => print(s"$element "))

    var deq = q1.dequeue

    print("\nQueue elements after dequeue: ")
    q1.foreach((element: Int) => print(s"$element "))

    print(s"\nDequeued element: $deq")

    println(s"\nQueue is empty: ${q1.isEmpty}")
  }
}
