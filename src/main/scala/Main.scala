//@main def hello: Unit =
//  println("Hello world!")
//  println(msg)
//
//def msg = "I was compiled by Scala 3. :)"


import scala.math._
//import scala.language.postfixOps

class Shape3D(val height:Double) {
  var h: Double = height
  var result : Double = _
  def volumne(): Unit ={
    result = h * h * h
    println("Volumne of Shape3D is " + result)
  }
}

class Cylinder(override val height:Double, val radious: Double) extends Shape3D(height) {
  var r :Double = radious
  override def volumne(): Unit = {
    result = math.Pi * r * r * h
    println("Volumne of Cylinder is " + result)
  }
}

object Shape3D {
  def main(args: Array[String]): Unit = {
    val shape = Cylinder(20,10)
    shape.volumne()
  }
}