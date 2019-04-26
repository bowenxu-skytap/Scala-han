package com.bowen.chapter03.arithmetic.assign

object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2
    println(num)
    num >>= 3
    println(num)

    val res = {
      if (num > 1) "ok" else 100
    }
    println(res)
  }
}
