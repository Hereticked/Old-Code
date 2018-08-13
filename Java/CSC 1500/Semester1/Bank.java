// James Poulette   CSC 1500 03

// This program stores the current balance of two bank accounts. A deposit and a 
// withdrawal will be made to each account. The program will print out the 
// initial balance in each account, the balances after the deposits, and the 
// balances after the withdrawals.

class Bank {

   public static void main (String[] args) {

      BankAcct account1 = new BankAcct (2000.00) ; // Instantiating account1 object
      BankAcct account2 = new BankAcct (1000.00) ; // Instantiating account2 object

      System.out.println ("Balance of account 1 : $ " + account1.GetBal());
      System.out.println ("Balance of account 2 : $ " + account2.GetBal());
      System.out.println ();

      account1.deposit (700.00) ; // invoke a method to deposit to account1
      account2.deposit (500.00) ; // invoke a method to deposit to account2

      System.out.println ("Balance of account 1 : $ " + account1.GetBal());
      System.out.println ("Balance of account 2 : $ " + account2.GetBal());
      System.out.println ();

      account1.withdraw (1300.00) ; // invoke a method to withdraw from account1
      account2.withdraw (1400.00) ; // invoke a method to withdraw from account2

      System.out.println ("Balance of account 1 : $ " + account1.GetBal());
      System.out.println ("Balance of account 2 : $ " + account2.GetBal());
      System.out.println ();
      System.out.println ("That's all folks!");

   } // method main

} // class Bank

class BankAcct {

   private double balance;

   public BankAcct (double bal) { // Constructor to initialize an account with its beginning 
      balance = bal;              // balance.
   } // constructor BankAcct

   public double GetBal() { // This method returns the current balance.
      return balance;
   } // method GetBal

   public void deposit (double amt) { // This method will add to the balance in an account
      if (amt >= 0)                   // if it is a valid amount to deposit.
         balance += amt;
   } // method deposit

   public void withdraw (double amt) {    // This method will deduct from the balance in an 
      if ((amt >= 0) && (amt <= balance)) // account if it is a valid amount to withdraw.
         balance -= amt;
   } // method withdraw

} // class BankAcct         
