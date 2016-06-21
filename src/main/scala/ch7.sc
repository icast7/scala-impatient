// 1. Write an example program to demonstrate that
//    package com.horstmann.impatient
// is not the same as
//    package com
//    package horstmann
//    package impatient

// See _7.scala

// 2. Write a puzzler that baffles your Scala friends, using a package com that isn’t at the top level.

// See _7.scala

// 3. Write a package random with functions nextInt(): Int, nextDouble(): Double, and setSeed( seed: Int): Unit. To
// generate random numbers, use the linear congruential generator next = (previous × a + b) mod 2^n, where a = 1664525,
// b = 1013904223, n = 32, and the initial value of previous is seed.

// See _7.scala

// 4. Why do you think the Scala language designers provided the package object syntax instead of simply letting you add
// functions and variables to a package?
//
// To keep all the functions and variables in a single place where they could be accessed by all package members

// 5. What is the meaning of private[com] def giveRaise( rate: Double)? Is it useful?
//
// It makes the function accessible through all the com._ packages. It ist't, it'd be the equivalent of making it public.

// 6. Write a program that copies all elements from a Java hash map into a Scala hash map. Use imports to rename both classes.
//
import java.util.{HashMap => JavaMap}
import scala.collection.mutable.{HashMap => ScalaMap}

val javaMap =  new JavaMap[String, String]
javaMap.put("1","one")
javaMap.put("2","two")
javaMap.put("3","three")

val iterator = javaMap.entrySet().iterator()

val scalaMap = new ScalaMap[String, String]
while (iterator.hasNext) {
  val entry = iterator.next
  scalaMap += ((entry.getKey, entry.getValue))
}
println("javamap:::")
javaMap
println("scalamap:::")
scalaMap

// 7. In the preceding exercise, move all imports into the innermost scope possible.
import java.util.{HashMap => JavaMap}
val javaMap2 =  new JavaMap[String, String]
javaMap2.put("1","one")
javaMap2.put("2","two")
javaMap2.put("3","three")

val iterator2 = javaMap2.entrySet().iterator()

import scala.collection.mutable.{HashMap => ScalaMap}
val scalaMap2 = new ScalaMap[String, String]
while (iterator2.hasNext) {
  val entry = iterator2.next
  scalaMap2 += ((entry.getKey, entry.getValue))
}
println("javamap:::")
javaMap2
println("scalamap:::")
scalaMap2


// 8. What is the effect of import java._ import javax._ Is this a good idea?
// Adding all the classes under java._ and javax._ to the current scope. Bad idea, it is better to import only the classes that are needed

// 9. Write a program that imports the java.lang.System class, reads the user name from the user.name system property,
// reads a password from the Console object, and prints a message to the standard error stream if the password is not "secret".
// Otherwise, print a greeting to the standard output stream. Do not use any other imports, and do not use any qualified names (with dots).

// See _7_9.scala

// 10. Apart from StringBuilder, what other members of java.lang does the scala package override?
scala.StringBuilder
//
scala.BigInt
scala.Boolean
scala.Iterable
scala.Iterator
scala.Long
scala.Stream
scala.Vector