package com.bowen.chapter02.datatype

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println(s"long max: ${Long.MaxValue}, long min: ${Long.MinValue}")

    var i = 10 //i Int
    var j = 10l //j Long

    var e = 34948794873943l //34948794873943 out of range int

  }
}
