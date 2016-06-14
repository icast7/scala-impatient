// 1. Improve the Counter class in Section 5.1, “Simple Classes and Parameterless Methods,” on page 49 so that it doesn’t turn negative at Int.MaxValue.
class Counter {
  private var value : BigInt = 0

  //Added this to test Int.MaxValue
  def setValue(newValue: Int): Unit ={
    value = newValue
  }

  def increment() { value += 1}

  def current = value
}

val myCounter = new Counter
myCounter.setValue(Int.MaxValue)
myCounter.increment
println(myCounter.current)

// 2. Write a class BankAccount with methods deposit and withdraw, and a read-only property balance.
class BankAccount {
  private var internalBalance : Double = 0

  def deposit(d: Double): Unit = {
    if (d > 0)
      internalBalance += d
  }

  def withdraw(w: Double): Unit = {
    if (w > 0)
      internalBalance -= w
  }

  def balance = internalBalance
}
val account = new BankAccount
account.withdraw(320.50)
account.deposit(585.75)
account.balance

// 3. Write a class Time with read-only properties hours and minutes and a method before( other: Time): Boolean that checks whether this time comes before the other. A Time object should be constructed as new Time( hrs, min), where hrs is in military time format (between 0 and 23).

class Time(private val hrs:Int, private val min:Int) {
  require(hrs > 0 && hrs < 24)
  require(min > 0 && min < 60)

  def before(t: Time) : Boolean = {

    if (t.hours != this.hours)
      //If hours are different returns TRUE if before and FALSE if after
      return (t.hours < this.hours)
    else
      //If hours are equal return TRUE if minutes are before and FALSE otherwise
      return (t.minutes < this.minutes)
  }

  def hours = hrs
  def minutes = min
}
val timer = new Time(22,30)
timer.hours
timer.minutes
timer.before(new Time(22,30))
timer.before(new Time(22,31))
timer.before(new Time(22,29))

// 4. Reimplement the Time class from the preceding exercise so that the internal representation is the number of minutes since midnight (between 0 and 24 × 60 – 1). Do not change the public interface. That is, client code should be unaffected by your change.
class TimeSinceMidnight(private val hrs:Int, private val min:Int) {
  require(hrs > 0 && hrs < 24)
  require(min > 0 && min < 60)

  private var minSinceMidnight: Int = toMin(hrs, min)
  def hours = hrs
  def minutes = min

  private def toMin(hrs:Int, min: Int): Int = {
    return hrs * 60 + min
  }

  def before(t: Time) : Boolean = {
    return toMin(t.hours, t.minutes) < minSinceMidnight
  }
}
val timerSinceMidnight = new Time(21,30)
timerSinceMidnight.hours
timerSinceMidnight.minutes
timerSinceMidnight.before(new Time(21,30))
timerSinceMidnight.before(new Time(21,31))
timerSinceMidnight.before(new Time(21,29))

// 5. Make a class Student with read-write JavaBeans properties name (of type String) and id (of type Long). What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and setters in Scala Should you?

// 6. In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,” on page 49, provide a primary constructor that turns negative ages to 0.

// 7. Write a class Person with a primary constructor that accepts a string containing a first name, a space, and a last name, such as new Person(" Fred Smith"). Supply read-only properties firstName and lastName. Should the primary constructor parameter be a var, a val, or a plain parameter? Why?

//8. Make a class Car with read-only properties for manufacturer, model name, and model year, and a read-write property for the license plate. Supply four constructors. All require the manufacturer and model name. Optionally, model year and license plate can also be specified in the constructor. If not, the model year is set to -1 and the license plate to the empty string. Which constructor are you choosing as the primary constructor? Why?

// 9. Reimplement the class of the preceding exercise in Java, C#, or C + + (your choice). How much shorter is the Scala class?

// 10. Consider the class  class Employee( val name: String, var salary: Double) { def this() { this(" John Q. Public", 0.0) } } Rewrite it to use explicit fields and a default primary constructor. Which form do you prefer? Why?