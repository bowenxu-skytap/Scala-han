package com.bowen.chapter06.oop

object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val p1 = new Person3
    println(p1.Name)
    println(p1.address)

    var a = new A
    println(a.var1)
    println(a.var2)
    println(a.var3)
    println(a.var4)

  }
}

class Person3 {
  var age = 10
  var sal = 8090.9
  val Name: String = null
  val address:String = null
}

class A {
  var var1: String = _  // String by default is null
  var var2: Byte = _
  var var3: Double = _
  var var4: Boolean = _
}