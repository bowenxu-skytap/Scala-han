package com.bowen.chapter03.arithmetic

object Demo01 {
  def main(args: Array[String]): Unit = {
    var r3 = 10.0 / 3
    println(r3.formatted("%.2f"))

    // % 运算原则：a % b = a - a/b * b
    println(-10 % 3) //-1
    println(-10 % -3) //-1
    println(10 % -3) //1

    // ++和--
    var num1 = 10
    num1 += 1
    println(num1)
  }
}
