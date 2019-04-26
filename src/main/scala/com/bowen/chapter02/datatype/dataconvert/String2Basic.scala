package com.bowen.chapter02.datatype.dataconvert

object String2Basic {
  def main(args: Array[String]): Unit = {
    val d1 = 1.2
    val s1 = d1 + ""
    print(s1)

    val s2 = "12"
    val num1 = s2.toInt
    val num2 = s2.toDouble
  }
}
