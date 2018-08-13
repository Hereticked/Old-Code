// James Poulette   CSC 1500 03

// Determines the exact change after a purchase is made. 

import java.io.*;

class Change {

	public static void main (String[] args) throws IOException {

		int sale = 0, change = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		// Read and process all purchases.

		while (sale != -1) {
			System.out.print ("Enter the purchase amount [0-100] (-1 to quit): ");
			System.out.flush();
			sale = Integer.parseInt(stdin.readLine());

			if (sale > 100) 
				System.out.println ("The maximum purchase amount is 100.");
				
 
			if (sale < -1) 
				System.out.println ("The minimum purchase amount is 0.");
			
		
			if (sale <= 100) { 
				if (sale >= 0) {
   
					change = (100 - sale);
					System.out.println ("Your change of " + change + " cents is given as:");
					quarters = (change / 25);
					if (quarters > 0)  
						if (quarters == 1)
							System.out.println ("1 Quarter");
						else
							System.out.println (quarters + " Quarters");
					else 
						System.out.println ("0 Quarters");

					change = (change) - (quarters * 25);
					dimes = (change) / 10;
					if (dimes > 0) 
						if (dimes == 1)
							System.out.println ("1 Dime");
						else
							System.out.println (dimes + " Dimes");
					else 
						System.out.println ("0 Dimes");

					change = (change) - (dimes * 10);
					nickels = (change) / 5;
					if (nickels > 0) 
						if (nickels == 1)
							System.out.println ("1 Nickel");
						else
							System.out.println (nickels + " Nickels");
					else 
						System.out.println ("0 Nickels");

					change = (change) - (nickels * 5);
					pennies = (change) / 1;
					if (pennies > 0) 
						if (pennies == 1)
							System.out.println ("1 Penny");
						else
							System.out.println (pennies + " Pennies");
					else 
						System.out.println ("0 Pennies");

					System.out.println();

				}

			}
				
		}

	} // method main

} // class Change					