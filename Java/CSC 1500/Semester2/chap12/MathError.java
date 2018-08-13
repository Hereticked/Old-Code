// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// MathError.java
// Chapter 12A Pages 544 - 545
// Known Bugs : None

// Causes an exception purposely.

public class MathError

{

   public static void main (String[] args)

   {

      int num = 13, demom = 0, result;

      result = num / demom;

   } // method main

} // class MathError

// Output :

/*

C:\Program Files\jdk1.2\bin>java MathError
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at MathError.main(MathError.java:20)

C:\Program Files\jdk1.2\bin>

*/