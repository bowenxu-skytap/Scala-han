package com.bowen.chapter05.mylazy

object LazyDemo {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("--------------")
    println(s"res=$res")
  }

  def sum(n1: Int, n2: Int) = {
    println("sum is running")
    n1 + n2
  }
}
