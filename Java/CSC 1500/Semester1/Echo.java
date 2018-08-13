// James Poulette   CSC 1500 03

// Reads a string from the user and prints it.

import java.io.*;

class Echo {

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		String message;

		System.out.println ("Enter a line of text:");

		message = stdin.readLine();

		System.out.println ("You entered: \"" + message + "\"");

	} // method main

} // class Echo