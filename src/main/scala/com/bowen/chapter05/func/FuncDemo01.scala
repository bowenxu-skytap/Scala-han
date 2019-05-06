package com.bowen.chapter05.func

object FuncDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 20
    println(getRes(n1, n2, ')'))
    println(getRes(n1, n2, '-'))
  }

  def getRes(n1: Int, n2: Int, oper: Char)= {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      null
    }
  }
}
