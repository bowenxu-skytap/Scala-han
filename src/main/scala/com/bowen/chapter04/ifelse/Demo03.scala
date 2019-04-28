package com.bowen.chapter04.ifelse

object Demo03 {
  def main(args: Array[String]): Unit = {
    val age = 7
    val res = if (age > 20) {
      println("hello age > 20")
      9 + 10
      "yes ok"
    } else {
      7
    }

    println(s"res = ${res}")
  }
}
