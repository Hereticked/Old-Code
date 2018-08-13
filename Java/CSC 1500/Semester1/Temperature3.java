// James Poulette   CSC 1500 03

// Uses an if-else statement to print one of two possible
// messages.

import java.io.*;

class Temperature3 {

	final static int FREEZING_POINT = 32;

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		System.out.println ("Enter the temperature:");
		int temperature = Integer.parseInt (stdin.readLine());

		System.out.println ("Current temperature: " + temperature);
		if (temperature <= FREEZING_POINT)
			System.out.println ("It's freezing in here.");
		else
			System.out.println ("Above freezing.");
		System.out.println ("Wrapping up.");

	} // method main

} // class Temperature3

