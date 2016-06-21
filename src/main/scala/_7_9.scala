/**
  * 9. Write a program that imports the java.lang.System class, reads the user name from the user.name system property,
  * reads a password from the Console object, and prints a message to the standard error stream if the password is not
  * "secret". Otherwise, print a greeting to the standard output stream. Do not use any other imports, and do not use
  * any qualified names (with dots).
  *
  * Created by icaste on 6/21/16.
  */
import java.lang.System._
object _7_9 extends App{
  val userName = getProperty("user.name")
  print("Password for " + userName + ": ");
  val pwd = Console.readLine
  if (pwd.equals("secret"))
    Console.println("Hello " + userName + " !")
  else
    err.println("Invalid password.")
}
