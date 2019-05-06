package com.bowen.chapter05.funcdetails

object Details2 {
  def main(args: Array[String]): Unit = {
    println(getSum(1, 2))
    println(getSum1(1, 2))
    println(getSum2(1, 2))
    println(getSum3(1, 2))
  }

  def getSum(n1: Int, n2: Int)= {
    n1 + n2
  }

  def getSum1(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  def getSum2(n1: Int, n2: Int) {
    return n1 + n2
  }

  def getSum3(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }
}
