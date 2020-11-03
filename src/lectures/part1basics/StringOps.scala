package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I'm learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.replace(" ", ","))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val num = "45"
  val aNum = num.toInt


  // Scala specific: String interpolators

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per min."
  println(myth)

  // raw-interpolators
  println(raw"This is a \n newline")
}
