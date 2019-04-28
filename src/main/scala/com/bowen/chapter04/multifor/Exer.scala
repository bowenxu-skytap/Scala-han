package com.bowen.chapter04.multifor

import scala.io.StdIn

object Exer {
  def main(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 5
    var score = 0.0
    var classScore = 0.0
    var totalScore = 0.0
    var countPass = 0
    for (i <- 1 to classNum) {
      for (j <- 1 to stuNum) {
        println(s"please enter ${i} class ${j} student's score:")
        score = StdIn.readDouble()
        if (score >= 60) {
          countPass += 1
        }
        classScore += score
      }
      totalScore += classScore
      println(s"${i} class's avg score is ${classScore / stuNum}")
      classScore = 0.0
    }
    println(s"total Score = ${totalScore.formatted("%.2f")}")
    println(s"the number of pass student is ${countPass}")
  }
}
