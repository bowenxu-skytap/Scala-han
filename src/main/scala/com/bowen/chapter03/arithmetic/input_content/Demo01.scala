package com.bowen.chapter03.arithmetic.input_content

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
    Cat.sayHi
    Cat.sayHello

    println("please input name:")
    val name = StdIn.readLine();
    println("please enter age:")
    val age = StdIn.readInt()
    println("Please enter sal:")
    val sal = StdIn.readDouble()
    println(f"user info is name=$name age=$age sal=${sal}%.2f")
  }
}


object Cat extends AAA {
  def sayHi = {
    println("wang wang")
  }
}

trait AAA { //等价interface + abstract class
  def sayHello = {
    println("AAA sayHello")
  }
}