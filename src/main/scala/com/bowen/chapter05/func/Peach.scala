package com.bowen.chapter05.func

object Peach {
  def main(args: Array[String]): Unit = {
    println(eat(0))
  }

  def eat(day: Int): Int = {
    if (day == 10) {
      return 1
    }
    (eat(day + 1) + 1) * 2
  }
}
