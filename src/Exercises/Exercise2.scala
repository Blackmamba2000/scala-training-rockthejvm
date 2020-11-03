package Exercises

object Exercise2 extends App {

  def greetingForKids(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println("...Greeting function....")
  println(greetingForKids("Karl", 35))
  println()


  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }
  println("...Factorial function...")
  println(factorial(5))
  println()

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println("...Fibonancci function...")
  println(fibonacci(5))
  println()



}
