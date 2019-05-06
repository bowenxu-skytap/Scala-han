package com.bowen.chapter05.funcdetails

object FuncDetails {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    test1(10, tiger)
    println(tiger.name)
  }

  def test1(n1: Int, tiger: Tiger): Tiger = {
    println(s"n1=$n1")
    tiger.name = "jack"
    tiger
  }

}

class Tiger {
  var name = ""
}
