// James Poulette   CSC 1500 03

// Uses a statement block in a conditional.

import java.io.*;

class Temperature2 {

	final static int THRESHOLD = 65;

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		System.out.println ("Enter the temperature:");
		int temperature = Integer.parseInt (stdin.readLine());

		System.out.println ("Current temperature: " + temperature);
		if (temperature < THRESHOLD) {
			System.out.print ("It's cold in here. ");
			System.out.println ("But we'll survive.");
		}
		System.out.println ("Wrapping up.");

	} // method main

} // class Temperature2

