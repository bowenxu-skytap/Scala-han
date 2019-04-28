package com.bowen.chapter04.For

object ForExer01 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var count = 0
    for (i <- Range(1, 101) if i % 9 == 0) {
      count += 1
      sum += i
    }
    println(count)
    println(sum)


    println("output add")
    val num = 6
    for (i <- Range(0, num + 1)) {
      println(s"$i + ${num - i} = $num")
    }
  }
}
