// 1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
import scala.collection.mutable.ArrayBuffer
import scala.util.Random
val n = 5
val a = (for (i <- 1 to n) yield Random.nextInt(n)).toArray

// 2. Write a loop that swaps adjacent elements of an array of integers. For example, Array( 1, 2, 3, 4, 5) becomes Array( 2, 1, 4, 3, 5).
val arrayEx2 = Array(1,2,3,4,5)
for (i <- 0 until arrayEx2.length if i % 2 == 1) {
  val a = arrayEx2(i-1)
  val b = arrayEx2(i)
  arrayEx2(i)=a
  arrayEx2(i-1)=b
}
print("Modified Array:")
arrayEx2

// 3. Repeat the preceding assignment, but produce a new array with the swapped values. Use for/ yield.
val arrayEx3 = Array(1,2,3,4,5)
print("Modified Array:")
val newAdjArray = for (i <- 0 until arrayEx3.length) yield {
  if (i % 2 == 1) {
    arrayEx3(i-1)
  } else {
    val myIndex = if (i + 1 == arrayEx3.length) i else i + 1
    arrayEx3(myIndex)
  }
}

// 4. Given an array of integers, produce a new array that contains all positive values of the original array, in their original order, followed by all values that are zero or negative, in their original order.
val arrayEx4 = Array(1,0,2,-11,3,-13,4,-15,5)
var resultEx4 = ArrayBuffer[Int]()
resultEx4 ++= arrayEx4.filter(_ > 0)++= arrayEx4.filter(_ <= 0)

// 5. How do you compute the average of an Array[Double]?
val myArray = Array(1.23, 4.54, 6.54)
val average = myArray.sum/myArray.length

// 6. How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
import scala.collection.mutable.ArrayBuffer

val originalArray = Array(1,3,2,5,4)
val originalArrayBuffer = ArrayBuffer(7,6,8,10,9)

val array = originalArray.sortWith(_ > _)
val arrayBuffer = originalArrayBuffer.sortWith(_ > _)

// 7. Write a code snippet that produces all values from an array with duplicates removed. (Hint: Look at Scaladoc.)
val arrayWithDuplicates = Array(1,3,2,5,4,1,3,2,5,4)
val arrayWithoutDuplicates = arrayWithDuplicates.distinct

// 8. Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on page 32. Collect indexes of the negative elements, reverse the sequence, drop the last index, and call a.remove(i) for each index. Compare the efficiency of this approach with the two approaches in Section 3.4.
var ex34 = ArrayBuffer(1,-4,9,-3,15,5,1,3,-9,-2,0)

//Collect indexes of the negative elements
println("Index of negative elements:")
var iOfNegElements = for (j <- 0 until ex34.length if ex34(j) >= 0) yield j

//Reverse the sequence
print("Reversed:")
iOfNegElements = iOfNegElements.reverse

//Drop the last index
print("Drop last index:")
iOfNegElements = iOfNegElements.dropRight(1)

//Remove each negative index
iOfNegElements = iOfNegElements.sortWith(_ > _)
for (i <- iOfNegElements){
    ex34.remove(i)
}
ex34


// 9. Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America. Strip off the "America/" prefix and sort the result.
import java.util.TimeZone
val timeZones = TimeZone.getAvailableIDs
    //Reverse sorted to test it works
val americaTimeZones = timeZones.filter(_.contains("America")).map(_.replace("America/","")).sortWith(_ > _)

// 10. Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call Click here to view code image val flavors = SystemFlavorMap.getDefaultFlavorMap(). asInstanceOf[ SystemFlavorMap] Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor and get the return value as a Scala buffer. (Why this obscure class? It’s hard to find uses of java.util.List in the standard Java library.)
import java.awt.datatransfer._
//TODO