package com.mlesniak

import scala.sys.process._

object App extends App {
  def mul(x: Int): Int = {
    2 * x
  }

  println("Hello World! " + mul(10))
  val lj = new LegacyJava
  lj.legacyCall()

  val out = "ls -1".!!
  println(out)
}
