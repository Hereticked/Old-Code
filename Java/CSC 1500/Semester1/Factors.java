// James Poulette   CSC 1500 03

// Uses a while loop to print the factors of an input value.

import java.io.*;

class Factors {

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		int count = 1, number;

		System.out.println ("Enter a positive number:");
		number = Integer.parseInt (stdin.readLine());

		System.out.println ("The factors of " + number + " are:");
		while (count <= (number/2)) {
			if (number%count == 0)
				System.out.println (count);
			count = count + 1;
		}

	} // method main

} // class Factors