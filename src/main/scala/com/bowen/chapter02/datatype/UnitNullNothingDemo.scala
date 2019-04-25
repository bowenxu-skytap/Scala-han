package com.bowen.chapter02.datatype

object UnitNullNothingDemo {

  def main(args: Array[String]): Unit = {
    val res = sayHello
    print(res)

    val dog: Dog = null
    //var char1: Char = null
    print("ok")
  }

  def sayHello: Unit = {

  }
}

class Dog {

}