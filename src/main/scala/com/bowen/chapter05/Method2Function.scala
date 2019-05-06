package com.bowen.chapter05

object Method2Function {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.sum(1, 2))

    val f1 = dog.sum _
    println(s"f1=$f1")
    println(s"f1=${f1(1, 2)}")

    //function
    val f2 = (n1: Int, n2: Int) => n1 + n2
    println(s"f2=$f2")
    println(s"f2=${f2(1, 2)}")
  }


}

class Dog {
  //method
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
