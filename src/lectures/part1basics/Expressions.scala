package lectures.part1basics

object Expressions {

  val x = 1 + 2
  println(x)

  val aCond = true
  val aConditionedValue = if (aCond) 5 else 3
  println(aConditionedValue)


  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  } // DON'T WRITE THIS IN SCALA

  // EVERYTHING IN SCALA IS AN EXPRESSION!

  // Side effects: printing to the console, while loops, and re-assigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. What is the difference between the String: "Hello World" vs println("Hello World") ?
  //    Hello world is a string literal vs the println is a side effect.
  // 2. What is the value of

}
