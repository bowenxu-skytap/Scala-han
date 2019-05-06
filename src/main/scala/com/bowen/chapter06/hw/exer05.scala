package com.bowen.chapter06.hw

object exer05 {
  def main(args: Array[String]): Unit = {

  }

  def mi(x: Double, n: Int): Double = {
    if (n == 0) return 1
    if (n < 0) return 1 / mi(x, -n)
    x * mi(x, n - 1)
  }
}
