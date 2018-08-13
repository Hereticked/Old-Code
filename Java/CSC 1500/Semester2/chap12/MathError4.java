// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// MathError4.java
// Chapter 12A Pages 549 - 550
// Known Bugs : None

// Adds corrective code to the catch block.

public class MathError4

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
         System.out.println ("Denominator corrected to 1");

         result = num / 1;

      }

      System.out.println ("Result is " + result);

   } // method main

} // class MathError4

// Output :

/*

C:\Program Files\jdk1.2\bin>java MathError4
The official message is / by zero
Denominator corrected to 1
Result is 13

C:\Program Files\jdk1.2\bin>

*/