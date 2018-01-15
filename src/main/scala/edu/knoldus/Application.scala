package edu.knoldus

import org.apache.log4j.Logger


object Application extends App{

  val log = Logger.getLogger(this.getClass)
  val obj = new Operations

  val list1 = (1 to 10).toList
  val rotatedList = obj.rotate(list1,3)
  print(s"$rotatedList \n")

  val list2 = List(1, 1, 2, 2, 2, 3, 3)
  val listWithoutConsecutiveDuplicates = obj.eliminateConsecutiveDuplicates(list2)
  log.info(s"$listWithoutConsecutiveDuplicates \n")

  val number1 = 19
  val number2 = 20
  val isHappy1 = obj.isHappy(number1)
  val isHappy2 = obj.isHappy(number2)
  if(isHappy1) {
    log.info(s"$number1 is Happy \n")
  }
  else {
    log.info(s"$number1 is Sad \n")
  }

  if(isHappy2) {
    log.info(s"$number2 is Happy \n")
  }
  else {
    log.info(s"$number2 is Sad \n")
  }

}
