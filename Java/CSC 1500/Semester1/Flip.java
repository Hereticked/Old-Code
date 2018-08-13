// James Poulette   CSC 1500 03

// Simulates flipping a coin.

import java.io.*;
import java.util.*;

class Flip {

   public static void main (String[] args) throws IOException {

      BufferedReader stdin = new BufferedReader
         (new InputStreamReader(System.in));

      Random coin = new Random();      

      int count = 1, heads = 0, tails = 0;
      int number_flips, flip_result;

      System.out.print ("Enter the number of flips: ");
      System.out.flush();
      number_flips = Integer.parseInt (stdin.readLine()); 
      while (count <= number_flips) {
         flip_result = Math.abs (coin.nextInt()) % 2;
         if (flip_result == 0)
            heads = heads + 1;
         else
            tails = tails + 1;
         count = count + 1; }

      System.out.println ("The number of heads is " + heads);
      System.out.println ("The number of tails is " + tails);

   } // method main

} // class Flip      

         

      





