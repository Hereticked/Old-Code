// James Poulette
// CSC 1550 03
// 99 - 03 - 07
// PizzaSize.java   Page 225   #2
// Known Bugs : None

// Allows the user to order a pizza and displays the appropriate bill.

import java.text.*;

public class PizzaSize


{

   public static void main(String[]args) throws Exception

   {

      double[] price = {6.99, 8.99, 12.50, 15.0};

      char size;

      DecimalFormat df1 = new DecimalFormat ("#####0.00");

      System.out.println("What size pizza would you like? (S, M, L, X)");

      size = (char)System.in.read();

      switch (size) {

         case ('s') : System.out.println("Your bill is $" + price[0]);
	    break;
	 case ('m') : System.out.println("Your bill is $" + price[1]);
	    break;
         case ('l') : System.out.println("Your bill is $" + df1.format(price[2]));
	    break;
         case ('x') : System.out.println("Your bill is $" + df1.format(price[3]));
	    break;
	 case ('S') : System.out.println("Your bill is $" + price[0]);
	    break;
         case ('M') : System.out.println("Your bill is $" + price[1]);
	    break;
	 case ('L') : System.out.println("Your bill is $" + df1.format(price[2]));
	    break;
         case ('X') : System.out.println("Your bill is $" + df1.format(price[3]));
	    break;
         default : System.out.println("That is not a valid pizza size!");

      }

   }

}

// Output :

/*

C:\Program Files\JDK\bin>javac PizzaSize.java

C:\Program Files\JDK\bin>java PizzaSize
What size pizza would you like? (S, M, L, X)
s
Your bill is $6.99

C:\Program Files\JDK\bin>java PizzaSize
What size pizza would you like? (S, M, L, X)
M
Your bill is $8.99

C:\Program Files\JDK\bin>java PizzaSize
What size pizza would you like? (S, M, L, X)
l
Your bill is $12.50

C:\Program Files\JDK\bin>java PizzaSize
What size pizza would you like? (S, M, L, X)
X
Your bill is $15.00

C:\Program Files\JDK\bin>

*/
