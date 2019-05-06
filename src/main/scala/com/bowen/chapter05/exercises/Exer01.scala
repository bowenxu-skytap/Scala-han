package com.bowen.chapter05.exercises

import scala.io.StdIn

object Exer01 {
  def main(args: Array[String]): Unit = {
    println("Please enter a number:")
    val n = StdIn.readInt()
    print99(n)

  }

  def print99(n: Int): Unit ={
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j}\t")
      }
      println()
    }
  }
}
