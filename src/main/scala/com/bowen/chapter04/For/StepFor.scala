package com.bowen.chapter04.For

object StepFor {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10) {
      println(s"i = $i")
    }

    println("step = 2")

    // Range(1, 10, 2)对应的构建方法是
    // def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    for (i <- Range(2, 10, 2)) {
      println(s"i = $i")
    }

    println("*******")
    for (i <- 1 to 10 if i % 2 == 1) {
      println(s"i = $i")
    }
  }
}
