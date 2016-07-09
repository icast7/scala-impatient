package ch8

/**
  * 3. Consult your favorite Java or C + + textbook that is sure to have an example of a toy inheritance hierarchy,
  * perhaps involving employees, pets, graphical shapes, or the like. Implement the example in Scala.
  */
object e3 {
  //From https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
  class Bicycle(var cadence: Int,   var gear: Int, var speed: Int) {}

  class MountainBike(var seatHeight:Int, cadence: Int, gear: Int, speed: Int) extends Bicycle(cadence, gear, speed)

  class RoadBike(var weight:Double, cadence: Int, gear: Int, speed: Int) extends Bicycle(cadence, gear, speed)
}
