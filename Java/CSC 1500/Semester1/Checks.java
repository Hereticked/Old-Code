// James Poulette   CSC 1500 03

// Check writing program. Gives you a budget of $10,000.00
// and allows you to write checks until you run out of money.

import java.io.*;
import java.text.*;

class Checks {

   public static void main (String[] args) throws IOException {

      double TOTAL = 0.0, LARGEST = 0.0, SMALLEST = 0.0, AVERAGE = 0.0, CHECK = 1.0, BALANCE = 10000.0;	
      int COUNT = 0; 

      DecimalFormat df1 = new DecimalFormat ("#####0.00");

      System.out.println ();
      System.out.println ("You have $10,000.00 in your checking account.");
      System.out.println ();
      System.out.println ("You may enter checks one at a time. If at any time you");
      System.out.println ("enter a value of zero or less this program will terminate."); 
      System.out.println ("Checks that exceed your current balance will not be counted."); 
      System.out.println ("When you are done writing checks a report will be displayed.");

      BufferedReader stdin = new BufferedReader
         (new InputStreamReader(System.in));

      while ((CHECK > 0.0) && (BALANCE > 0.0)) {
         System.out.println ();
         System.out.println ("Your current balance is $" + df1.format(BALANCE));
         System.out.println (); 
         System.out.print ("Enter check amount [0 to terminate] : $");
         CHECK = new Double(stdin.readLine()).doubleValue();	
         if ((CHECK > 0.0) && (CHECK <= BALANCE)) {
            BALANCE = BALANCE - CHECK;
	    TOTAL = TOTAL + CHECK;
	    COUNT = COUNT + 1;
	    if (COUNT == 1) {
	       LARGEST = CHECK;
	       SMALLEST = CHECK;
	       AVERAGE = CHECK; }
	    else {
	       if (CHECK > LARGEST) { 
	          LARGEST = CHECK; }
	       if (CHECK < SMALLEST) {
	          SMALLEST = CHECK; }
	       AVERAGE = TOTAL / COUNT; } }
         else {
            if (CHECK > 0.0) { 
               System.out.println ();
               System.out.println ("You cannot write a check for $" + df1.format(CHECK)); }
	    else {
               System.out.println ();
	       System.out.println ("Program terminated"); } }
      } // while loop

      if (COUNT == 0) {
         System.out.println ();
         System.out.println ("You did not write any checks. No report will be displayed."); }
      else {
         System.out.println ();
         System.out.println ("            Check Writing Report");
         System.out.println ("            --------------------");
         System.out.println ();
         System.out.println ("Beginning Balance \t\t :   $10000.00");
         System.out.println ("Number of Checks Written \t :   " + COUNT);
         System.out.println ("Total Sum of Checks Written \t :   $" + df1.format(TOTAL));
         System.out.println ("Largest Check Written \t\t :   $" + df1.format(LARGEST));
         System.out.println ("Smallest Check Written \t\t :   $" + df1.format(SMALLEST));
         System.out.println ("Average Check Written \t\t :   $" + df1.format(AVERAGE));
         System.out.println ("Ending Balance \t\t\t :   $" + df1.format(BALANCE)); }
	
   } // method main

} // class Checks