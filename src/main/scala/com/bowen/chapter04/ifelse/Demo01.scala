package com.bowen.chapter04.ifelse

//import scala.io.StdIn
import scala.io._ // _表示把包里所有内容一起引入

object Demo01 {
  def main(args: Array[String]): Unit = {
    println("enter age:")
    val age = StdIn.readInt()
    if (age > 18) println("age > 18")
  }

  // 如何查看包下的内容
}
