// 1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
import scala.util.Random
val n = 5
val a = (for (i <- 1 to n) yield Random.nextInt(n)).toArray

// 2. Write a loop that swaps adjacent elements of an array of integers. For example, Array( 1, 2, 3, 4, 5) becomes Array( 2, 1, 4, 3, 5).
//TODO

// 3. Repeat the preceding assignment, but produce a new array with the swapped values. Use for/ yield.

// 4. Given an array of integers, produce a new array that contains all positive values of the original array, in their original order, followed by all values that are zero or negative, in their original order.

// 5. How do you compute the average of an Array[Double]?
val myArray = Array(1.23, 4.54, 6.54)
val average = myArray.sum/myArray.length

// 6. How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
import scala.collection.mutable.ArrayBuffer

val originalArray = Array(1,2,3,4,5)
val originalArrayBuffer = ArrayBuffer(6,7,8,9,10)

val b = for (i<- (0 until originalArray.length).reverse) yield originalArray(i)
val c = for (i<- (0 until originalArrayBuffer.length).reverse) yield originalArrayBuffer(i)

// 7. Write a code snippet that produces all values from an array with duplicates removed. (Hint: Look at Scaladoc.)

// 8. Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on page 32. Collect indexes of the negative elements, reverse the sequence, drop the last index, and call a.remove( i) for each index. Compare the efficiency of this approach with the two approaches in Section 3.4.

// 9. Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America. Strip off the "America/" prefix and sort the result.

// 10. Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call Click here to view code image val flavors = SystemFlavorMap.getDefaultFlavorMap(). asInstanceOf[ SystemFlavorMap] Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor and get the return value as a Scala buffer. (Why this obscure class? It’s hard to find uses of java.util.List in the standard Java library.)
