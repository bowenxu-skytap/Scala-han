package com.bowen.chapter05.func

object Fib {
  def main(args: Array[String]): Unit = {
    val num = 7
    val res = fib(num, new Array[Int](num + 1))
    println(res)
  }

  def fib(n: Int, memo: Array[Int]): Int = {
    if (memo(n) != 0) {
      memo(n)
    }
    if (n == 1 || n == 2) {
      memo(n) = 1
    } else {
      memo(n) = fib(n - 1, memo) + fib(n - 2, memo)
    }
    memo(n)
  }
}
