package com.bowen.chapter04.For

object MultiFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 3) {
      println(s"i = $i, j = $j")
    }

    println()

    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(s"i = $i, j = $j")
      }
    }
  }
}
