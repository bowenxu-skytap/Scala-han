package com.bowen.chapter01

object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = "world!"
    println(str1 + " " + str2)

    var name: String = "tom"
    var age: Int = 10
    var sal: Float = 10.67f
    var height: Double = 180.15
    printf("name = %s, age = %d, salary = %.2f, height = %.1f", name, age, sal, height)
    println()

    println(s"people info:\nname: $name\nage: $age\nsalary: ${sal * 10}")
  }
}
