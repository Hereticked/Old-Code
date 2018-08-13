// James Poulette   CSC 1550 03   99 - 02 - 07

// Divide.java   Page 64   #8

// Yet another program that uses a bunch of methods to do some basic math.

public class Divide {

   public static void main (String[] args) {

      int num1 = 104;
      int num2 = 12;

      calculate(num1, num2);

   } // method main

   public static void calculate(int a, int b) {

      int quotient, remainder;

      quotient = a / b;
      remainder = a % b;

      System.out.println(a + " / " + b + " = " + quotient + "   r " + remainder);

   } // method calculate

} // class Divide  
