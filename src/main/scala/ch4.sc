// 1. Set up a map of prices for a number of gizmos that you covet. Then produce a second map with the same keys and the prices at a 10 percent discount.
val gizmap100 = Map("Echo"->179.99, "Kindle"->119.99, "Chromecast Audio"->35.00)
val gizmap90 = for((k,v) <- gizmap100) yield (k, v * 0.9)


// 2. Write a program that reads words from a file. Use a mutable map to count how often each word appears. To read the words, simply use a java.util.Scanner:  val in = new java.util.Scanner( new java.io.File(" myfile.txt")) while (in.hasNext()) process in.next() Or look at Chapter 9 for a Scalaesque way. At the end, print out all words and their counts.
import java.io.File
import java.util
import java.util.Scanner

import scala.collection.immutable.ListMap

val scanner1 = new Scanner(new File("/Users/icastillejos/github/scala-impatient/out/production/scala-impatient/textfile.txt"))
val countMap = new scala.collection.mutable.HashMap[String, Int]
while (scanner1.hasNext()){
  val word: String = scanner1.next()
  countMap(word) = countMap.getOrElse(word, 0) + 1
}
scanner1.close()
////Sort words by number of occurrences
ListMap(countMap.toSeq.sortWith(_._2 > _._2):_*)

// 3. Repeat the preceding exercise with an immutable map.
val scanner2 = new Scanner(new File("/Users/icastillejos/github/scala-impatient/out/production/scala-impatient/textfile.txt"))
var immutableMap = new scala.collection.immutable.HashMap[String, Int]
while (scanner2.hasNext()){
  val word: String = scanner2.next()
  val occurrences = immutableMap.getOrElse(word, 0) + 1
  immutableMap = immutableMap + (word -> occurrences)
}
scanner2.close()
////Sort words by number of occurrences
ListMap(immutableMap.toSeq.sortWith(_._2 > _._2):_*)

// 4. Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
val scanner3 = new Scanner(new File("/Users/icastillejos/github/scala-impatient/out/production/scala-impatient/textfile.txt"))
var immutableSortedMap = scala.collection.immutable.SortedMap[String, Int]()
while (scanner3.hasNext()){
  val word: String = scanner3.next()
  var occurrences: Int = 1
  if (immutableSortedMap.keySet.contains(word)){
    occurrences = immutableSortedMap(word) + 1
  }

  immutableSortedMap =  immutableSortedMap + (word -> occurrences)
}
scanner3.close()
immutableSortedMap
////Sort words by number of occurrences
ListMap(immutableSortedMap.toSeq.sortWith(_._2 > _._2):_*)

// 5. Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
import scala.collection.JavaConversions.mapAsScalaMap
val scanner4 = new Scanner(new File("/Users/icastillejos/github/scala-impatient/out/production/scala-impatient/textfile.txt"))
val treeMap: scala.collection.mutable.Map[String, Int] = new util.TreeMap[String, Int]
while (scanner4.hasNext()){
  val word: String = scanner4.next()
  treeMap(word) = treeMap.getOrElse(word, 0) + 1
}
scanner4.close()
treeMap

// 6. Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and similarly for the other weekdays. Demonstrate that the elements are visited in insertion order.
import java.util.Calendar
import java.util.Locale
import scala.collection.JavaConversions.mapAsScalaMap

val daysOfWeek = Calendar.getInstance()
  .getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US)
val listMap = daysOfWeek.toList.sortBy(_._2)

var linkedHashMap  = new scala.collection.mutable.LinkedHashMap[String, Int]()
for ((a, b) <- listMap) {
  linkedHashMap(a) = b
}
linkedHashMap

// 7. Print a table of all Java properties, like this:
/**
  * java.runtime.name     | Java( TM) SE Runtime Environment
  * sun.boot.library.path | /home/ apps/ jdk1.6.0_21/ jre/ lib/ i386
  * java.vm.version       | 17.0-b16
  * java.vm.vendor        | Sun Microsystems Inc.
  * java.vendor.url       | http:// java.sun.com/
  * path.separator        | :
  * java.vm.name          | Java HotSpot( TM) Server VM
**/
//You need to find the length of the longest key before you can print the table.
import scala.collection.JavaConversions.propertiesAsScalaMap
val props : scala.collection.Map[String, String] = System.getProperties()
val longestKey = props.keySet.reduceLeft((a, b) => if (a.length>b.length) a else b)
val padding = "%1$-" + longestKey.size +"s | %2$s"
println(props.size + " properties found")
for ((k,v) <- props) {
  val result = padding.format(k, v)
  println(result)
}

// 8. Write a function minmax( values: Array[ Int]) that returns a pair containing the smallest and largest values in the array.
def getMinMax(intArray:Array[Int]) : (Int, Int) = {
  return (intArray.min , intArray.max)
}
getMinMax(Array(9,8,7,6,1,2,3,4,5))

// 9. Write a function lteqgt( values: Array[ Int], v: Int) that returns a triple containing the counts of values less than v, equal to v, and greater than v.
def lteqgt(intArray:Array[Int], v:Int) : (Int, Int, Int) = {
  val less = intArray.count(_ < v)
  val equal = intArray.count(_ == v)
  val greater = intArray.count(_ > v)
  return (less, equal, greater )
}
lteqgt(Array(9,8,7,6,5,2,3,4,5), 5)

// 10. What happens when you zip together two strings, such as "Hello". zip(" World")? Come up with a plausible use case.
val word1 = "Hello"
val word2 = "World"
val zippedWords = word1.zip(word2)
