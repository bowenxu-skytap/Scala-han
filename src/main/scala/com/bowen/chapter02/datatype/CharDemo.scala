package com.bowen.chapter02.datatype

object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    println(char1)

    // char 数值运算
    var char2 = 'a'
    var num = 10 + char2
    println(num)

    //reason:
    //1. 当把一个计算的结果赋值一个变量，则编译器会进行类型转换及判断（会看范围+类型）
    //2. 当把一个自变量赋值一个变量，则编译器会进行范围判断
    var c2: Char = 'a' + 1
    var c3: Char = 97 + 1
    var c4: Char = 98

    var c5: Char = ('a' + 1).toChar
    print(c5)
  }
}
