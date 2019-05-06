package com.bowen.chapter06.hw

object Exer03 {
  def main(args: Array[String]): Unit = {
    val n = 3
    val res1 = (0 to n).reverse
    println(res1)

    //foreach
    // 接受函数 (f: Int => U)，接受一个输入参数为Int, 输出为Unit的函数
    //1. 将res1每个元素依次遍历出来，传递给println(x)
    res1.foreach(println)
    res1.foreach(myShow)
    println("-------------------")
    (0 to n).reverse.foreach(println)
  }

  def myShow(n: Int) = {
    println("xxxxxxxx")
    println(n)
  }
}
