package lectures.part1basics

object CallByNameVsCallByValue extends App {

  def calledByValue(x: Long) = {
    println("By value: " + x)
    println("By value: " + x)
  }


  def calledByName(x: => Long) = {
    println("By Name: " + x)
    println("By Name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


}
