package com.bowen.chapter05.funcdetails

object Details3 {
  def main(args: Array[String]): Unit = {

    // private final
    def f1() = {
      println("f1")
    }

    println("ok~~")

    def sayOk() = { // private final sayOk$1
      println("main sayOK")
      def sayOk(): Unit ={  // private final sayOk$2
        println("sayok sayok")
      }
    }
  }

  def sayOK() = {
    println("main sayOK")
  }
}
