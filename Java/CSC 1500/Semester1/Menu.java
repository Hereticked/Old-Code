// James Poulette and Jamie Rudat

// CSC 1500 03

// Presents a menu with several numbered choices. When the user indicates a choice
// the appropriate information is displayed. The menu will continue to prompt the user
// for a choice until the user chooses to quit.

import java.io.*;

class Menu {

   public static void main (String[] args) throws IOException {

      BufferedReader stdin = new BufferedReader
         (new InputStreamReader(System.in));

      int choice;

      do {

         display_menu(); 
         System.out.print("Enter your selection : ");
         choice = Integer.parseInt(stdin.readLine());

	 System.out.println();

	 if ((choice > 8) || (choice < 1)) {
	    System.out.println("Invalid selection. Please try again.");
	 }

	 else {
	 
            switch (choice) {
               case (1) : System.out.println("New York State");
	          break;
	       case (2) : System.out.println("Albany");
	          break;
               case (3) : System.out.println("Bluebird");
	          break;
               case (4) : System.out.println("Rose");
	          break;
               case (5) : System.out.println("Sugar Maple");
	          break;
               case (6) : System.out.println("\"The Empire State\"");
	          break;
               case (7) : System.out.println("Apple");
	    }

         }

      } while (choice != 8);
	 
   } // method main

   private static void display_menu() {

      System.out.println("\n\t\t\t Menu" + 
		         "\n\t\t\t ----" + 
		         "\n\n\t Select \t\t\t To Obtain" +
		         "\n\t ------ \t\t\t ---------" +
		         "\n\n\t   1 \t\t\t\t State Name" +
		         "\n\t   2 \t\t\t\t State Capital" +
		         "\n\t   3 \t\t\t\t State Bird" +
			 "\n\t   4 \t\t\t\t State Flower" +
			 "\n\t   5 \t\t\t\t State Tree" +
			 "\n\t   6 \t\t\t\t State Motto" +
			 "\n\t   7 \t\t\t\t State Fruit" +
			 "\n\t   8 \t\t\t\t Quit \n");

   } // method display_menu

} // class Menu
