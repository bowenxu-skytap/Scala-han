package com.bowen.chapter04.ifelse

import scala.io.StdIn

object Exer03 {
  def main(args: Array[String]): Unit = {
    println("input score:")
    val time = StdIn.readDouble()
    if (time <= 8) {
      println("input gender:")
      val gender = StdIn.readChar()
      if (gender == 'm') println("enter man group") else println("enter women group")
    } else {
      println("you are eliminated")
    }
  }
}
