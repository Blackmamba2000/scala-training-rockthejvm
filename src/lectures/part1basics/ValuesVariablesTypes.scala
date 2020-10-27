package lectures.part1basics

object ValuesVariablesTypes {

  val x = 42
  println(x)

  // Val are immutalbe. Like constants
  // Var are mutable

  val aString: String = "hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x

  // Variables
  var aVariable: Int = 4
  aVariable = 5 // side effects

}
