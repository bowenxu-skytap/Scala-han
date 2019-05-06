package com.bowen.chapter06.hw

object Exer02 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    println(list.reverse) // List(3, 2, 1)
    println((1 to 10).reverse)

    for (i <- 0 to 10 reverse) println(i)

  }
}
