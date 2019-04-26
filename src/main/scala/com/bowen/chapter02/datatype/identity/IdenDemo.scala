package com.bowen.chapter02.datatype.identity

object IdenDemo {
  def main(args: Array[String]): Unit = {
    val ++ = "hello world"
    print(++)

    val -+ = 90
    print(s"\nres: ${-+}")

    //val -q = "abc" //error

    var `true` = "hello scala"
    println(`true`)
  }
}
