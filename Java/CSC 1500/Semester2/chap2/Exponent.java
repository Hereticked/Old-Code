// James Poulette   CSC 1550 03   99 - 02 - 07

// Exponent.java   Page 63   #5

// Another program that uses a bunch of methods to do some basic math.

public class Exponent {

   public static void main (String[] args) {

      int num = 4;
      int display1, display2;

      display1 = square(num);
      display2 = cube(num);

      System.out.println(num + " squared is " + display1);
      System.out.println(num + " cubed is " + display2);

   } // method main

   public static int square(int z) {

      int result1 = z * z;
      
      return result1;

   } // method square

   public static int cube(int a) {

      int result2 = a * a * a;

      return result2;

   } // method cube

} // class Exponent
