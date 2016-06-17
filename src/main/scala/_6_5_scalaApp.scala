/**
  * Write a Scala application, using the App trait, that prints the command-line arguments in reverse order, separated
  * by spaces. For example, scala Reverse Hello World should print World Hello.
  * Created by icaste on 6/15/16.
  */
object scalaApp extends App {
  var msg : String = ""
  //1
  msg = ""
  for (i <- (args.length-1) to 0 by -1) {
    msg += args(i) + " "
  }
  println(msg)
  //2
  msg = ""
  for (i <- args.reverse) {
    msg += i + " "
  }
  println(msg)
  //3
  print(args.reverse.mkString(" "))
}
//scalac /Users/icaste/scala-impatient/src/main/scala/_6_5_scalaApp.scala
//scala -Dscala.time scalaApp test1 test2 test3 test4
