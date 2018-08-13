// James Poulette   CSC 1500 03

// Reads two integers and prints their sum.

import java.io.*;

class Addition2 {

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		int num1, num2;

		System.out.println ("Enter a number:");
		num1 = Integer.parseInt (stdin.readLine());

		System.out.println ("Enter another number:");
		num2 = Integer.parseInt (stdin.readLine());

		System.out.println ("The sum is " + (num1 + num2));

	} // method main

} // class Addition2
		

