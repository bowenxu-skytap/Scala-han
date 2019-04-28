package com.bowen.chapter04.mywhile

object WhileDemo01 {
  def main(args: Array[String]): Unit = {
    var i = 10
    while (i > 0) {
      println(s"hello $i")
      i -= 1
    }

    println("do while")
    var j = 0
    do {
      println(s"hello $j")
      j += 1
    } while (j < 10)
  }
}
