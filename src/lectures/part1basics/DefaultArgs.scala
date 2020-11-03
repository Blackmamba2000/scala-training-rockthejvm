package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def Tail_Recursive_Factorial(n: Int, accumulator: Int = 1): Int =
    if (n <= 1) accumulator
    else Tail_Recursive_Factorial(n-1, n * accumulator)

  val fact10 = Tail_Recursive_Factorial(10, 1)

}
