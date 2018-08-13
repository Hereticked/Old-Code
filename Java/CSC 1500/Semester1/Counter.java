// James Poulette   CSC 1500 03

// Uses a while loop to count to 5.

class Counter {

	final static int LIMIT = 5;

	public static void main (String[] args) {

		int count = 1;

		while (count <= LIMIT) {
			System.out.println (count);
			count = count + 1;
		}
		
		System.out.println ("done");

	} // method main

} // class Counter