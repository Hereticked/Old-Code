// James Poulette   CSC 1500 03

// Reads two integers and prints their sum.

import java.io.*;

class Addition {

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		String string1, string2;
		int num1, num2, sum;

		System.out.println ("Enter a number:");
		string1 = stdin.readLine();
		num1 = Integer.parseInt (string1);

		System.out.println ("Enter another number:");
		string2 = stdin.readLine();
		num2 = Integer.parseInt (string2);

		sum = num1 + num2;
		System.out.println ("The sum is " + sum);

	} // method main

} // class Addition
		

