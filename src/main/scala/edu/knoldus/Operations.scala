package edu.knoldus

class Operations {

  def rotate(list: List[Int], numberOfPlaces: Int): List[Int] = {
    list match {
      case head :: tail => if(numberOfPlaces != 0) rotate(tail :+ head, numberOfPlaces - 1) else list
    }
  }

  def eliminateConsecutiveDuplicates(list: List[Int]): List[Int] = {
    def innerEliminate(list: List[Int], eliminatedList: List[Int]): List[Int] = {
      list match {
        case head1 :: head2 :: tail => if(head1 == head2) {
          innerEliminate(head2 :: tail, eliminatedList)
        }
        else {
          innerEliminate(head2 :: tail, eliminatedList :+ head1)
        }
        case head :: Nil => eliminatedList :+ head
      }
    }
    innerEliminate(list, List())
  }

  def sumOfSquaresOfDigits(number: Int, count: Int): Int = {
    number match {
      case number => if(number != 0) {
        sumOfSquaresOfDigits(number / 10, (number % 10) * (number % 10) + count)
      }
      else {
        count
      }
    }
  }

  def contain(list: List[Int], element: Int): Boolean = {
    list match {
      case head :: tail => if(head == element) true else contain(tail, element)
      case Nil => false
    }
  }

  def isHappy(number: Int): Boolean = {
    def innerOperate(num: Int, list: List[Int]): Boolean = {
      num match {
        case 1 => true
        case num => if(!contain(list, num)) {
          innerOperate(sumOfSquaresOfDigits(num, 0), list :+ num)
        } else {
          false
        }
      }
    }
    innerOperate(number, List())
  }

}
