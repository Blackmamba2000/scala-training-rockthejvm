package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if(n <= 0) 1
    else {
      println("Computing  factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))


  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumlator: BigInt): BigInt =
      if(x <= 1) accumlator
      else factHelper(x - 1, x * accumlator) // TAIL RECURSION = use the recursive call as the last expression

    factHelper(n, 1)
  }
  /*

  anotherFactorial(10) = factHelper(10,1)
   = factHelper(9, 10 * 1)
   = factHelper(8, 9 * 10 * 1)
   = factHelper(7, 8 * 9 * 10 * 1)
   = factHelper(6, 7 * 8 * 9 * 10 * 1)
   = factHelper(5, 6 * 7 * 8 * 9 * 10 * 1)
   = factHelper(4, 5 * 6 * 7 * 8 * 9 * 10 * 1)
   = factHelper(3, 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
   = factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
   = factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
   = factHelper(1, 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10)
   = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10

  */

  println(anotherFactorial(5000))

  // When you need Loops, use Tail Recursion

  /*
   1. Concatenate a string n times using Tail Recursion
   2. Create IsPrime function using Tail Recursion
   3. Create the Fibonnaci function using Tail Recursion
   */
}
