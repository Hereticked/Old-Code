// James Poulette   CSC 1500 03

// Uses the while statement to print the first ten powers 
// of two.

class Powers_of_Two {

	final static int LIMIT = 10;

	public static void main (String[] args) {

		int count = 1, power_of_two = 1;

		while (count <= LIMIT) {
			power_of_two = power_of_two * 2;
			System.out.print (power_of_two + " ");
			count = count + 1;
		}

		System.out.println ();
		System.out.println ("All done.");

	} // method main

} // class Powers_of_Two