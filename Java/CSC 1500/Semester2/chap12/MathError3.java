// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// MathError3.java
// Chapter 12A Page 549
// Known Bugs : None

// Uses the getMessage method that ArithmeticException inherits from the throwable class.

public class MathError3

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

         System.out.println ("The official message is " + error.getMessage());

      }

   } // method main

} // class MathError3

// Output :

/*

C:\Program Files\jdk1.2\bin>java MathError3
The official message is / by zero

C:\Program Files\jdk1.2\bin>

*/