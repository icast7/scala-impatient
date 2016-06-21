/**
  * Created by icaste on 6/16/16.
  */
// 1. Write an example program to demonstrate that
//    package com.horstmann.impatient
// is not the same as
//    package com
//    package horstmann
//    package impatient

package com.horstmann1 {
  object Utils1 {
    val Constant : String = "Constant"
    val K : Int = 123
  }
}
package com.horstmann1.impatient1 {
  //Need to import package to "see" Utils1
  import com.horstmann1.Utils1
  class Test {
    val c = Utils1.Constant
  }
}

package com {
  package horstmann2 {
    object Utils2 {
      val Constant : String = "Constant"
    }
    package impatient2 {
      //Do not need to import package to "see" Utils2
      class Test {
        val c = Utils2.Constant
      }
    }
  }
}

// 2. Write a puzzler that baffles your Scala friends, using a package com that isn’t at the top level.
package test {
  package com {
    object Puzzler {
      val o: String = "test"
    }
  }
}
object app_7_2 extends App {
  val b : String = test.com.Puzzler.o
  println(b)
}
//scalac /Users/icaste/scala-impatient/src/main/scala/_7.scala
//scala -Dscala.time app_7_2

// // 3. Write a package random with functions nextInt(): Int, nextDouble(): Double, and setSeed( seed: Int): Unit. To
// generate random numbers, use the linear congruential generator next = (previous × a + b) mod 2^n, where a = 1664525,
// b = 1013904223, n = 32, and the initial value of previous is seed.

package randompackage {
  package object random {
    private val a : Double = 1664525.0
    private val b : Double = 1013904223.0
    private val n : Double = 32.0
    var next : Int = 0

    def setSeed(seed: Int): Unit = {
      next = seed
    }

    def nextInt() : Int = {
      next = Math.round((next * a +b) % math.pow(2,32).toInt).toInt
      next
    }

    def nextDouble() : Double = {
      val nextDouble : Double = ((next * a +b) % math.pow(2,32).toInt)
      next = nextDouble.toInt
      nextDouble
    }
  }
  package random {
  }
}