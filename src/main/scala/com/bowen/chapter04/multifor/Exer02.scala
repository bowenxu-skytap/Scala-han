package com.bowen.chapter04.multifor

object Exer02 {
  def main(args: Array[String]): Unit = {
    val num = 9
    for (i <- 1 to num) {
      for (j <- 1 to i) {
        print(s"${j} * ${i} = ${i * j}\t")
      }
      println()
    }
  }
}
