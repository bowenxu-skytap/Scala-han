package com.bowen.chapter05.myexception

object ScalaExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      val r = 10 / 0
    } catch {
      case ex: ArithmeticException => println(ex.getMessage)
      case ex: Exception => println(ex.getMessage)
    } finally {
      println("scala finally..")
    }

    println("continue")
  }
}
