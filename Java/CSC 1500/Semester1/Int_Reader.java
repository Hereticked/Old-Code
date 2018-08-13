// James Poulette   CSC 1500 03

// Reads and prints ten integers seperated by white space
// across any number of lines.

import java.io.*;
import java.util.StringTokenizer;

class Int_Reader {

   public static void main (String[] args) throws IOException {

      BufferedReader stdin = new BufferedReader
         (new InputStreamReader(System.in));

      StringTokenizer reader;
      reader = new StringTokenizer (stdin.readLine());

      int count = 1;

      while (count <= 10) {
         while (reader.countTokens() == 0)
            reader = new StringTokenizer(stdin.readLine());
         System.out.println ("Number is " + Integer.parseInt (reader.nextToken()));
         count = count + 1; }

   } // method main

} // class Int_Reader      

         

      





