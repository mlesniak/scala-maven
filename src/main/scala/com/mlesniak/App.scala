package com.mlesniak

object App extends App {
  def mul(x: Int): Int = {
    2 * x
  }

  println("Hello World! " + mul(10))
  val lj = new LegacyJava
  lj.legacyCall()
}
