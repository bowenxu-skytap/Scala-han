package com.bowen.chapter04.ifelse

object Exer01 {
  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 5
    val sum = num1 + num2
    if (sum % 3 == 0 && sum % 5 == 0) println("can be divided by 3 and 5") else println("cannot")


    val year = 2018
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) println(s"$year is run nian") else println(s"$year is ping nian")
  }
}
