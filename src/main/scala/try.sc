val list1 = List(1,2,3)
val list2 = List(4,5)
val list = list1 :: list2

val a = List(List(1,2), List(3,4))
a.flatten
list1.dropWhile(_ < 3)
list1.map(x => x*x)

list1.headOption

//list.partition(x => x%2 != 0)

val x = (1 to 10).toList
x.find(_ == 10)
x.forall(_ == 5)
x.zipWithIndex

val t = List(1, 2, List(3, 4))
val temp = t.map(_.isInstanceOf[Int])

val (myList1, myList2) = x.span(_ == 1)

val input = List(1, 1, 2, 2, 3, 3, 3, 2, 2)
def runLengthEncoding(input: List[Int], output: List[List[Int]]): List[List[Int]] = {
  input match {
    case head :: tail => runLengthEncoding(input.dropWhile(_ == head), output :+ input.takeWhile(_ == head))
    case Nil => output
  }
}
val output: List[List[Int]] = List()
print(runLengthEncoding(input, output))