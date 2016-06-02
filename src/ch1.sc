// 1. In the Scala REPL, type 3. followed by the Tab key. What methods can be applied?
3

// 2. In the Scala REPL, compute the square root of 3, and then square that value. By how much does the result differ from 3? (Hint: The res variables are your friend.)
math.pow(math.sqrt(3), 2)

// 3. Are the res variables val or var?
//val
val x = 3

// 4. Scala lets you multiply a string with a number— try out "crazy" * 3 in the REPL. What does this operation do? Where can you find it in Scaladoc?
"crazy" * 3

// 5. What does 10 max 2 mean? In which class is the max method defined?
// Class scala.math.max
10 max 2

// 6. Using BigInt, compute 21024.
BigInt(2).pow(1024)

// 7. What do you need to import so that you can get a random prime as probablePrime( 100, Random), without any qualifiers before probablePrime and Random?
import scala.util.Random
import scala.BigInt.probablePrime
probablePrime(100, Random)

// 8. One way to create random file or directory names is to produce a random BigInt and convert it to base 36, yielding a string such as "qsnvbevtomcj38o06kul". Poke around Scaladoc to find a way of doing this in Scala.
BigInt.probablePrime(100,Random).toString(36)

// 9. How do you get the first character of a string in Scala? The last character?
val y : String = "world"
y(0)
val z : Int = y.length
y(z-1)

// 10. What do the take, drop, takeRight, and dropRight string functions do? What advantage or disadvantage do they have over using substring?
val a : String = "myworld"
a.take(1)
a.drop(1)
a.takeRight(1)
a.dropRight(1)
a