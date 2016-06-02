import scala.collection.mutable.ArrayBuffer

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