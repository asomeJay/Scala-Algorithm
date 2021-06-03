package test

import scala.io.StdIn.readInt

object Palindrome_Number {


  def main(args: Array[String]): Unit = {
    val x = readInt
    println(isPalindrome(x))
  }

  def isPalindrome(x: Int): Boolean = {
    if (x < 0) false
    else {
      val s = x.toString
      var first = 0
      var last = s.length - 1
      while ( first <= last){
        if (s(first) != s(last)) return false
        first += 1
        last -= 1
      }
      true
    }
  }
}
