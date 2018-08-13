// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// TwoErrors2.java
// Chapter 12A Page 552
// Known Bugs : None

// Throwing and catching multiple exceptions.

public class TwoErrors2

{

   public static void main (String[] args) throws ArithmeticException, IndexOutOfBoundsException

   {

      int num = 13, denom = 0, result;
      int[] array = {22, 33, 44};

      try

      {

         result = num / denom;
         result = array[num];

      }

      catch (Exception error)

      {

         System.out.println ("Error is " + error.getMessage());

      }

   } // method main

} // class TwoErrors2

// Output :

/*

C:\Program Files\jdk1.2\bin>java TwoErrors2
Error is / by zero

C:\Program Files\jdk1.2\bin>

*/