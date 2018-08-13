// James Poulette   CSC 1550 03   99 - 02 - 07

// Eggs.java   Page 63   #3

// This program groups eggs into dozens...   This is so assanine.

public class Eggs {

   public static void main (String[] args) {

      int numberOfEggs = 69;

      dozens(numberOfEggs);

   } // method main

   public static void dozens(int num) {

      int numOfDozens, leftovers;

      numOfDozens = num / 12;
      leftovers = num % 12;

      System.out.println(num + " eggs yields " + numOfDozens + " dozen eggs and " +
			 leftovers + " leftover eggs.");      

   } // method dozens

} // class Eggs
