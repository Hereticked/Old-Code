// James Poulette and Jamie Rudat

// CSC 1500 03

// This program provides a method to read a series of letter grades (A,B,C,D,E,F)
// from a user and counts the number of each grade. It also provides a method that
// prints a histogram of the letter grade distribution. The class implementation
// makes use of the switch statement and the for statement.

import java.io.*;

class Histogram {

   public static void main (String[] args) throws IOException {

      int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
      String grade;

      BufferedReader stdin = new BufferedReader
         (new InputStreamReader(System.in));

      System.out.println();
      System.out.println("Please enter letter grades (A-F or Q to quit) :");
      System.out.println();

      do {

         grade = stdin.readLine();
	 grade = grade.toUpperCase();

         if ((grade.length()) != 1) {
            System.out.println("\n" + grade + " is an invalid grade.");
         } // end if

	 else {
	    switch (grade.charAt(0)) {
               case 'A': a++;
		  break;
               case 'B': b++;
		  break;
               case 'C': c++;
		  break;
               case 'D': d++;
		  break;
               case 'E': e++; 
		  break;
               case 'F': f++;
		  break;
               case 'Q': 
		  break;
               default : System.out.println("\n" + grade + " is invalid. Please try again.");
	    } // end switch
	 } // end else

      System.out.println();

      } while ((grade.charAt(0)) != 'Q');

      System.out.println("\t\tGrade Histogram");
      System.out.println("\t\t---------------");

      graph("A", a);
      graph("B", b);
      graph("C", c);
      graph("D", d);
      graph("E", e);
      graph("F", f);

      System.out.println();
      System.out.println("This program is terminated.");

   } // method main

   private static void graph (String letter, int num) {

      System.out.print(letter + ": ");

      for (int count = 0; count < num; count++) {
         System.out.print('*');
      }

      System.out.println();
     
   } // method graph

} // class Histogram
