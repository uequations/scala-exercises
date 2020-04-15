package exercise.op

trait Ops[T] {

  def mergePair(a: T, b: T): T

  def range(item : T): Int

  def shouldMerge(a: T, b: T) : Boolean

  def mergeableElementExists(list: List[T], item: T): Boolean
}
