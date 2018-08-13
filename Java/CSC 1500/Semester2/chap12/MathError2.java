// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// MathError2.java
// Chapter 12A Pages 547 - 548
// Known Bugs : None

// Catches an arithmetic exception.

public class MathError2

{

   public static void main (String[] args) throws ArithmeticException

   {

      int num = 13, demom = 0, result;

      try

      {

         result = num / demom;

      }

      catch (ArithmeticException error)

      {

         System.out.println ("Attempt to divide by zero!");

      }

   } // method main

} // class MathError2

// Output :

/*

C:\Program Files\jdk1.2\bin>java MathError2
Attempt to divide by zero!

C:\Program Files\jdk1.2\bin>

*/