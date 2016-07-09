package ch8

import scala.collection.mutable.ListBuffer

/**
  * 4. Define an abstract class Item with methods price and description. A SimpleItem is an item whose price and description
  * are specified in the constructor. Take advantage of the fact that a val can override a def. A Bundle is an item that
  * contains other items. Its price is the sum of the prices in the bundle. Also provide a mechanism for adding items to
  * the bundle and a suitable description method.
  */

object e4 extends App {
  val simpleItem = new SimpleItem(100.00, "One hundred bucks")
  println("SimpleItem:")
  println(simpleItem.price)
  println(simpleItem.description)

  val bundle = new Bundle
  bundle.addItemToBundle(new SimpleItem(2.00, "Two"))
  bundle.addItemToBundle(new SimpleItem(3.00, "Three"))
  println("Bundle:")
  println(bundle.description)
  println(bundle.price)
}

abstract class Item(){
  def price() : Double
  def description() : String
}

class SimpleItem(override val price: Double, override val description: String) extends Item

class Bundle extends Item {
  private var items = new ListBuffer[Item]()

  def addItemToBundle(item: Item): Unit = {
    items += item
  }

  def removeItemFromBundle(item: Item) : Unit = {
    items -= item
  }

  override def description: String = {
    var fullDescription: String = ""
    items.foreach(fullDescription += _.description + "\n")
    fullDescription
  }

  override def price: Double = {
    var fullPrice : Double = 0
    items.foreach(fullPrice += _.price)
    fullPrice
  }
}