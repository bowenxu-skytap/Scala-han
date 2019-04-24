package com.bowen.chapter01

object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](10)
    //format: command + option + l
    for (item <- arr) {
      println(s"item=$item")
    }
  }
}
