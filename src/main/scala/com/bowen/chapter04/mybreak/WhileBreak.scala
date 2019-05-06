package com.bowen.chapter04.mybreak

import util.control.Breaks._

object WhileBreak {
  def main(args: Array[String]): Unit = {
    var n = 1
    // 1. breakable是一个高阶函数，可以接收函数的函数
    // 2. breakable 对 break()抛出的异常做了处理，代码继续运行
    // 3. 接受代码块，用大括号
    breakable {
      while (n <= 20) {
        n += 1
        println(s"n=$n")
        if (n == 18) {
          break()
        }
      }
    }
    println("ok")

    breakable {
      for (i <- 1 to 100) {
        println(s"i=$i")
        if (i == 20) break
      }
    }
    println("ok2")
  }
}
