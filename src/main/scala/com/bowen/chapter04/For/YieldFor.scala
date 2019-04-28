package com.bowen.chapter04.For

object YieldFor {
  def main(args: Array[String]): Unit = {
    // 1. traverse 1 to 10
    // 2. yield i 将每次循环得到的放入vector中，最后返回
    // 3. i 这里可以加代码块，可以对i进行处理
    // 4. 下面体现出对collection各个数据进行处理，然后返回新的collection

    val res = for (i <- 1 to 10) yield {
      if (i % 2 == 0) i else "不是偶数"
    }
    println(res)

  }
}
