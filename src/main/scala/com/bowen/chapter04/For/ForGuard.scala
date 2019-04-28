package com.bowen.chapter04.For

object ForGuard {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 if i != 2) {
      println("i: " + i)
    }

    for (i <- 1 to 3; j = 4 - i) {
      println("j: " + j)
    }
  }
}
