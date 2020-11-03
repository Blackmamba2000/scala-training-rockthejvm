package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, nTimes: Int): String = {
    if(nTimes == 1) aString
    else aString + aRepeatedFunction(aString, nTimes-1)
  }
  println(aRepeatedFunction("hello", 3))
  // WHEN YOU NEED LOOPS, USE RECURSION INSTEAD.


  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n-1)
  }

  /* Exercises 2
    1. Write a greeting function for kids. It takes 2 parameters. (name, age)
       Output: "Hi, my name is $name and I am $age years old."

    2. Factorial function that outputs: 1 * 2*3* .. * n

    3. A Fibonanci function that outputs:
       f(1) = 1
       f(2) = 1
       f(n) = f(n-1) + f(n-2)

    4. Test if a number is prime?

   */

}
