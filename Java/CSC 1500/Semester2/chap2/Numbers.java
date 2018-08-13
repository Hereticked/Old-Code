// James Poulette   CSC 1550 03   99 - 02 - 07

// Numbers.java   Page 63   #2

// Uses a bunch of methods to do some basic math.

public class Numbers {

   public static void main (String[] args) {

      int num1 = 666;
      int num2 = 69;
      int display;

      sum(num1, num2);
      difference(num1, num2);

      display = product(num1, num2);

      System.out.println("The product of the numbers is : " + display);

   } // method main

   public static void sum(int x, int y) {

      int result1 = x + y;
      
      System.out.println("The sum of the numbers is : " + result1);

   } // method sum

   public static void difference(int a, int b) {

      int result2 = a - b;

      System.out.println("The difference of the numbers is : " + result2);

   } // method difference

   public static int product(int m, int n) {

      int result3 = m * n;

      return result3;

   } // method product

} // class Numbers
