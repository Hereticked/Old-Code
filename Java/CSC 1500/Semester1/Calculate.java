// James Poulette
// CSC 1550 03   
// 99 - 02 - 11
// Calculate.java   Page 157   #5a
// Known Bugs : None

// Performs a mathematical operation with two designated numbers based on what
// the user inputs.

public class Calculate {

   public static void main(String[] args) throws Exception {

      int num1 = 100, num2 = 5;
      char charin;

      System.out.print("Enter your selection (A,S,M) : ");

      charin = (char)System.in.read();

      switch (charin) {

         case ('a') : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	    break;
	 case ('s') : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	    break;
         case ('m') : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	    break;
         case ('A') : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	    break;
	 case ('S') : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	    break;
         case ('M') : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	    break;
         default : System.out.println("That is not a valid selection.");

      } // end switch

   } // method main

} // class Calculate

// Output :

/*

C:\Program Files\JDK\bin>java Calculate
Enter your selection (A,S,M) : A
100 + 5 = 105

C:\Program Files\JDK\bin>java Calculate
Enter your selection (A,S,M) : s
100 - 5 = 95

C:\Program Files\JDK\bin>java Calculate
Enter your selection (A,S,M) : M
100 * 5 = 500

C:\Program Files\JDK\bin>

*/