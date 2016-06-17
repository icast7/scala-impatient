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
