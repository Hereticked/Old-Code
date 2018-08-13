// James Poulette   CSC 1550 03   99 - 02 - 07

// DemoOverload.java   Page 99   Grey Box #8

// Demonstrates method overloading.

public class DemoOverload {

   public static void main (String[] args) {

      int month = 6, day = 24, year = 2003;

      overloadDate(month);
      overloadDate(month, day);
      overloadDate(month, day, year);

   } // method main

   public static void overloadDate(int mm) {

      System.out.println("Event date " + mm + "/1/2001");
   }

   public static void overloadDate(int mm, int dd) {

      System.out.println("Event date " + mm + "/" + dd + "/2001");

   }

   public static void overloadDate(int mm, int dd, int yy) {

      System.out.println("Event date " + mm + "/" + dd + "/" + yy);

   }

} // class DemoOverload
