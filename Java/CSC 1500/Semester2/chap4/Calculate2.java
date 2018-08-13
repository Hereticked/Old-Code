// James Poulette
// CSC 1550 03   
// 99 - 02 - 11
// Calculate2.java   Page 157   #5b
// Known Bugs : None

// Performs a mathematical operation with two designated numbers based on what
// the user inputs.

public class Calculate2 {

   public static void main(String[] args) throws Exception {

      int num1 = 100, num2 = 5;
      char charin;

      System.out.print("Enter your selection (A,S,M,D) : ");

      charin = (char)System.in.read();

      switch (charin) {

         case ('a') : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	    break;
	 case ('s') : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	    break;
         case ('m') : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	    break;
         case ('d') :
            if(num2 == 0)
               System.out.println("You cannot divide by zero.");
            else
               System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	    break;
         case ('A') : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	    break;
	 case ('S') : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	    break;
         case ('M') : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	    break;
         case ('D') :
            if(num2 == 0)
               System.out.println("You cannot divide by zero.");
            else
               System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	    break;
         default : System.out.println("That is not a valid selection.");

      } // end switch

   } // method main

} // class Calculate2

// Output :

/*

C:\Program Files\JDK\bin>java Calculate2
Enter your selection (A,S,M,D) : a
100 + 5 = 105

C:\Program Files\JDK\bin>java Calculate2
Enter your selection (A,S,M,D) : S
100 - 5 = 95

C:\Program Files\JDK\bin>java Calculate2
Enter your selection (A,S,M,D) : m
100 * 5 = 500

C:\Program Files\JDK\bin>java Calculate2
Enter your selection (A,S,M,D) : D
100 / 5 = 20

C:\Program Files\JDK\bin>

*/
