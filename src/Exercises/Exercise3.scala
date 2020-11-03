package Exercises

import scala.annotation.tailrec

object Exercise3 extends App {

  // Concatenate a string n times using Tail Recursion
  @tailrec
  def concatenate_Tail_Recursion(s: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenate_Tail_Recursion(s, n-1, s + accumulator)
  }
  println("~~~ Tail Recursive Program ~~~")
  println(concatenate_Tail_Recursion("hello", 3, ""))
  println()


  def isPrime_Tail_Recursion(n: Int): Boolean = {
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }
  println("~~~ Is Prime Program ~~~~")
  println(isPrime_Tail_Recursion(2))
  println()


  def fibonnaci_Tail_Recursion(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }
  println("~~~ Fibonnaci Tail Recursion Program ~~~")
  println(fibonnaci_Tail_Recursion(8))







}
