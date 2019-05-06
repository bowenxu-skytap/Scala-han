package com.bowen.chapter05.func

object FuncTheory {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 3
    val res = sum(n1, n2)
    println(s"res = $res")
  }

  def sum(n1: Int, n2: Int): Int ={
    n1 + n2
  }
}
