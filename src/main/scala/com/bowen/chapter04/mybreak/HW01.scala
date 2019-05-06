package com.bowen.chapter04.mybreak

import util.control.Breaks._

object HW01 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println(s"first time that bigger than 20 is $i")
          break
        }
      }
    }

    // method 2:
    println("=================")
    sum = 0
    var j = 0
    for (i <- 1 to 100 if sum <= 20) {
      sum += i
      j = i
    }
    println(s"first time that bigger than 20 is $j")
  }
}
