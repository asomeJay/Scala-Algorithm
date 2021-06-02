package test

import scala.io.StdIn.readLine

object reverse_integer {
  def main(args: Array[String]): Unit = {
    val a:Int = readLine.toInt
    println(reverse(a))
  }

  def reverse(x:Int): Int = {
    var xx = x

    if (x < 0) xx = xx * -1
    try{
      if ( x < 0) xx.toString.reverse.toInt * -1
      else xx.toString.reverse.toInt
    } catch {
      case e: NumberFormatException => 0
    }
  }
}

