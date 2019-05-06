package com.bowen.chapter05.myexception

object ThrowDemo {
  def main(args: Array[String]): Unit = {
    try {
      val res = test()
    } catch {
      case ex: Exception => println(ex.getMessage)
    } finally {
      println("finally")
    }

    println("ok")
  }

  def test()= {
    throw new Exception("exception happen")
  }
}
