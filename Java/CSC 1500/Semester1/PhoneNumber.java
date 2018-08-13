// James Poulette   CSC 1500 03

// This program allows the user to enter a phone number in (xxx)xxx-xxxx format.
// It will make use of the StringTokenizer class to identify the parts of the 
// phone number.

import java.io.*;
import java.util.StringTokenizer;

class PhoneNumber {

   public static void main (String[] args) throws IOException {

      String area_code;
      String exchange;
      String extension;

      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      
      // Get the phone number from the user. Store it in a StringTokenizer object
      // whose delimeters are set to the following characters: space, dash, left
      // parenthesis, right parenthesis.

      System.out.println ("Enter the phone number in (xxx)xxx-xxxx format : ");
      StringTokenizer number = new StringTokenizer(stdin.readLine(), "() -");

      if (number.countTokens() == 3) { // found 3 parts of the phone number
         area_code = number.nextToken();
	 exchange = number.nextToken();
	 extension = number.nextToken();

	 System.out.println ("Area Code : " + area_code);
	 System.out.println ("Exchange : " + exchange);
	 System.out.println ("Extension : " + extension);
      } 
      else { // user did not enter phone number in correct format
	 System.out.println ("Did not get 3 tokens.\nUser did not use the correct format.");
      }

      System.out.println ("\nPress any key to continue.");
      stdin.readLine();

   } // method main

} // class PhoneNumber
