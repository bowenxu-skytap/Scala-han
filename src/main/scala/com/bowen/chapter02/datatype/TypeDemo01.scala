package com.bowen.chapter02.datatype

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    //如果没有形参，可以省略()
    println(num1.toDouble + "\t" + num1.toString + " " + 100.toDouble)
    sayHi
    sayHi()

    var isPass = true
    println(isPass.toString)
  }

  def sayHi(): Unit = {
    println("say hi")
  }
}
