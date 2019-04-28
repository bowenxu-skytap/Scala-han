package com.bowen.chapter04.For

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    // start to end 前后闭合
    for (i <- start to end) {
      println(s"hello + $i")
    }

    var list = List("hello", 10, 30, "tom")
    for (item <- list) println(s"item=$item")

    // start to end 前闭后开
    for (i <- start until end) {
      println(s"hello + $i")
    }


  }
}
