// 1. Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.
object Conversions {
  def inchesToCentimeters(inches: Double): Double = {
    val centimeters = inches * 2.54
    centimeters
  }
  def gallonsToLiters(gallons: Double): Double = {
    val liters = gallons * 3.78541
    liters
  }
  def milesToKilometers(miles: Double): Double = {
    val kilometers = miles * 1.60934
    kilometers
  }
}
Conversions.inchesToCentimeters(1)
Conversions.gallonsToLiters(1)
Conversions.milesToKilometers(1)

// 2. The preceding problem wasn’t very object-oriented. Provide a general superclass UnitConversion and define objects InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it.
abstract class UnitConversion(val objectName: String){
  def convert(inches: Double) : Double
}
object InchesToCentimeters extends UnitConversion("InchesToCentimeters") {
  override def convert(n: Double): Double ={
    val centimeters = n * 2.54
    centimeters
  }
}
object GallonsToLiters extends UnitConversion("GallonsToLiters") {
  override def convert(n: Double): Double ={
    val liters = n * 3.78541
    liters
  }
}
object MilesToKilometers extends UnitConversion("MilesToKilometers") {
  override def convert(n: Double): Double ={
    val kilometers = n * 1.60934
    kilometers
  }
}
InchesToCentimeters.objectName
InchesToCentimeters.convert(1)
GallonsToLiters.objectName
GallonsToLiters.convert(1)
MilesToKilometers.objectName
MilesToKilometers.convert(1)

// 3. Define an Origin object that extends java.awt.Point. Why is this not actually a good idea? (Have a close look at the methods of the Point class.)
object Origin extends java.awt.Point {

}

// 4. Define a Point class with a companion object so that you can construct Point instances as Point( 3, 4), without using new.
class Point(val a: Int, val b:Int) {}
object Point {
  def apply(a: Int, b: Int): Point = { new Point(a, b) }
}
val p = Point(0, 1)
p.a
p.b

// 5. Write a Scala application, using the App trait, that prints the command-line arguments in reverse order, separated by spaces. For example, scala Reverse Hello World should print World Hello.

//See _6_5_scalaApp.scala

// 6. Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠.
object Poker extends Enumeration {
  val club = Value ("♣")
  val diamond = Value ("♦")
  val heart = Value ("♥")
  val spade = Value ("♠")
}
Poker.club
Poker.diamond
Poker.heart
Poker.spade

// 7. Implement a function that checks whether a card suit value from the preceding exercise is red.

// 8. Write an enumeration describing the eight corners of the RGB color cube. As IDs, use the color values (for example, 0xff0000 for Red).