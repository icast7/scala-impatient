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
  //Don't to allow the Origin point to ever move or mutate
  override def move(x: Int,  y:Int) : Unit = {
  }

  override def setLocation(p: java.awt.Point) : Unit = {
    move(p.x, p.y)
  }
}

// 4. Define a Point class with a companion object so that you can construct Point instances as Point( 3, 4), without using new.
class Point1(val a: Int, val b:Int) {
  println("Creating new instance of class Point")
}
object Point1 {
  def apply(a: Int, b: Int): Point1 = { new Point1(a, b) }
}
val p = Point1(0, 1)
p.a
p.b

// 5. Write a Scala application, using the App trait, that prints the command-line arguments in reverse order, separated by spaces. For example, scala Reverse Hello World should print World Hello.

//See _6_5_scalaApp.scala

// 6. Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠.
object Suit extends Enumeration {
  type Suit = Value
  val club = Value ("♣")
  val diamond = Value ("♦")
  val heart = Value ("♥")
  val spade = Value ("♠")
}
Suit.club
Suit.diamond
Suit.heart
Suit.spade

// 7. Implement a function that checks whether a card suit value from the preceding exercise is red.
def isRed(s: Suit.Suit) : Boolean = {
  s == Suit.heart | s== Suit.diamond
}
isRed(Suit.club)
isRed(Suit.diamond)
isRed(Suit.heart)
isRed(Suit.spade)

// 8. Write an enumeration describing the eight corners of the RGB color cube. As IDs, use the color values (for example, 0xff0000 for Red).
object color extends Enumeration {
  type color = Value
  val Black =   (0x000000, "Black")
  val Green =   (0x0000ff, "Green")
  val Blue =    (0x00ff00, "Blue")
  val Cyan =    (0x00ffff, "Cyan")
  val Red =     (0xff0000, "Red")
  val Magenta = (0xff00ff, "Magenta")
  val Yellow =  (0xffff00, "Yellow")
  val White =   (0xffffff, "White")
}
val hexFormat = "0X%06X"
color.Black._2 + ": "+ hexFormat.format(color.Black._1)
color.Green._2 + ": "+ hexFormat.format(color.Green._1)
color.Blue._2 + ": "+ hexFormat.format(color.Blue._1)
color.Cyan._2 + ": "+ hexFormat.format(color.Cyan._1)
color.Red._2 + ": "+ hexFormat.format(color.Red._1)
color.Magenta._2 + ": "+ hexFormat.format(color.Magenta._1)
color.Yellow._2 + ": "+ hexFormat.format(color.Yellow._1)
color.White._2 + ": "+ hexFormat.format(color.White._1)
