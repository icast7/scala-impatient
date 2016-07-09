package ch8

/**
  * 1. Extend the following BankAccount class to a CheckingAccount class that charges $ 1 for every deposit and withdrawal.
  // class BankAccount( initialBalance: Double) {
  //      private var balance = initialBalance
  //      def currentBalance = balance
  //      def deposit( amount: Double) = {
  //        balance += amount;
  //        balance
  //      }
  //      def withdraw( amount: Double) = {
  //        balance -= amount;
  //        balance }
  //      }
  // }
  */
object e1 extends App {
  val a = new CheckingAccount(100)
  a.currentBalance
  a.deposit(5)
  a.withdraw(2)
}

class BankAccount (initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance

  def deposit(amount: Double) = {
    balance += amount;
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount;
    balance
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = {
    super.deposit(amount)
    super.withdraw(1)
  }
  override def withdraw(amount: Double) = {
    super.withdraw(amount)
    super.withdraw(1)
  }
}