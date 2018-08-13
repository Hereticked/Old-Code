// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// TwoErrors.java
// Chapter 12A Page 551
// Known Bugs : None

// Throwing and catching multiple exceptions.

public class TwoErrors

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

      catch (ArithmeticException error)

      {

         System.out.println ("Arithmetic error");

      }

      catch (IndexOutOfBoundsException error)

      {

         System.out.println ("Index error");

      }

   } // method main

} // class TwoErrors

// Output :

/*

C:\Program Files\jdk1.2\bin>java TwoErrors
Arithmetic error

C:\Program Files\jdk1.2\bin>

*/