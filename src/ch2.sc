// 1. The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero. Write a function that computes this value.
def signum(a: Int) = {
  if (a > 0)        1
  else if (a < 0)  -1
  else              0
}
signum(-4)
signum(5)
signum(0)

// 2. What is the value of an empty block expression {}? What is its type
val x = {}
print("Value: " + x)
print("Type: " + x.getClass)

// 3. Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a suitable type for x.)
var y = 0
val z: Unit = y = 1

// 4. Write a Scala equivalent for the Java loop
// for (int i = 10; i > = 0; i--) System.out.println( i);
for(i <- 10 to 0 by -1)
  println(i)

// 5. Write a procedure countdown( n: Int) that prints the numbers from n to 0.
def cd (n: Int) {
  //No return type defined (Unit type is implied)
  countdown(n)
}
def countdown(n:Int) : Unit = {
  //Define return type as Unit
  if (n >= 0 ) {
    for (i <- n to 0 by -1)
      println(i)
  }
}
cd(3)
cd(0)
cd(-3)

// 6. Write a for loop for computing the product of the Unicode codes of all letters in a string. For example, the product of the characters in "Hello" is 9415087488L.
// 7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
// 8. Write a function product( s : String) that computes the product, as described in the preceding exercises.
// 9. Make the function of the preceding exercise a recursive function.
// 10. Write a function that computes xn, where n is an integer. Use the following recursive definition: • xn = y . y if n is even and positive, where y = xn / 2. • xn = x·xn – 1 if n is odd and positive. • x0 = 1. • xn = 1 / x– n if n is negative. Don’t use a return statement.