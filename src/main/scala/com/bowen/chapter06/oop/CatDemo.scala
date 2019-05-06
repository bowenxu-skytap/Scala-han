package com.bowen.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白" //等价call cat.name_$eq("小白")
    cat.age = 10
    cat.color = "白色"

    println(s"小猫信息如下：${cat.name}, ${cat.age}, ${cat.color}")  //等价call cat.name()
  }
}

class Cat {
  // 说明
  // 1. 当我们声明了var name: String时，在底层对应private name
  // 2. 同时会生成两个public方法name() <=类似=> getter and name_$eq() => setter
  var name = ""
  var age = 0
  var color = ""
}
