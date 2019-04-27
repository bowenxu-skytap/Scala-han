package com.bowen.chapter03.arithmetic.notice

object Demo01 {
  def main(args: Array[String]): Unit = {
    val num = if (5 > 4) 5 else 4

    val n1 = 4
    val n2 = 8
    var res = if (n1 > n2) n1 else n2
    println(s"res=$res")

    val n3 = 11
    res = if (res > n3) res else n3
    println(s"res=$res")

    //,运算
    println("hello", "world")
  }
}
