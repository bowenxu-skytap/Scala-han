package com.bowen.chapter06.hw

object Exer04 {
  def main(args: Array[String]): Unit = {
    var res = 1l
    "Hello".foreach(res *= _.toLong)
    println(s"res=$res")
    println("----------------")
    println(product("Hello"))

    def myCount(char: Char) = {
      res *= char.toLong
    }
  }

  def product(s: String): Long = {
    if (s.length == 1) return s.charAt(0).toLong
    s.charAt(0).toLong * product(s.drop(1))
  }

}
