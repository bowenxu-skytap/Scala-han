package com.bowen.chapter04.For

object UseFor2 {
  def main(args: Array[String]): Unit = {
    for {
      i <- 1 to 3
      j = i * 2
    } {
      println(s"i = $i, j = $j")
    }
  }
}
