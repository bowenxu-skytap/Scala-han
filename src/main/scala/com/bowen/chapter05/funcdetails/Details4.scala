package com.bowen.chapter05.funcdetails

object Details4 {
  def main(args: Array[String]): Unit = {
    println(sayOk())
    println(sayOk("mary"))
  }

  def sayOk(name: String = "jack") = {
    s"name $name"
  }
}
