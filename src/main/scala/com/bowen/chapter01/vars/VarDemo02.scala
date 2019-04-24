package com.bowen.chapter01.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推到
    val num = 10 // num is Int
    //method 1, can use idea prompt
    //method 2, can use isInstanceOf[Int]
    println(num.isInstanceOf[Int])

    //类型确定后，就不能修改，说明scala是强类型语言

    var age = 10
    age = 30

    val num2 = 30
    // num2 = 40 val is immutable

    val dog = new Dog
    dog.name = "lucky"
    dog.age = 90
  }

}

class Dog {
  var age: Int = _
  var name: String = _
}
