package ch8

/**
  * 2. Extend the BankAccount class of the preceding exercise into a class SavingsAccount that earns interest every month
  * (when a method earnMonthlyInterest is called) and has three free deposits or withdrawals every month. Reset the
  * transaction count in the earnMonthlyInterest method.
  */
object e2 extends App {
  val s = new SavingsAccount(100, 10)
  s.currentBalance
  s.deposit(5)
  s.deposit(5)
  s.deposit(5)
  s.deposit(5)
  s.withdraw(5)
  s.withdraw(5)
  s.withdraw(5)
  s.withdraw(5)
  s.currentBalance
}

class SavingsAccount(initialBalance: Double, private  val interest: Double) extends BankAccount(initialBalance){
  private var numOfDeposits = 0
  private var numOfWithdrawals = 0

  override def deposit(amount: Double) = {
    numOfDeposits+=1
    if (numOfDeposits > 3)
      super.withdraw(1)
    println("NumberOfDeposits: " +  numOfDeposits)
    super.deposit(amount)
  }
  override def withdraw(amount: Double) = {
    numOfWithdrawals+=1
    if (numOfWithdrawals > 3)
      super.withdraw(1)
    println("NumberOfWithdrawals: " +  numOfWithdrawals)
    super.withdraw(amount)
  }

  def earnMonthlyInterest(): Unit ={
    val earnings = currentBalance * interest/100
    super.deposit(earnings)
  }
}

