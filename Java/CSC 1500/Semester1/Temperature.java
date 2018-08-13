// James Poulette   CSC 1500 03

// Makes a decision about the temperature to determine if
// a particular message should be printed.

import java.io.*;

class Temperature {

	final static int THRESHOLD = 65;

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		System.out.println ("Enter the temperature:");
		int temperature = Integer.parseInt (stdin.readLine());

		System.out.println ("Current temperature: " + temperature);
		if (temperature < THRESHOLD)
			System.out.println ("It's cold in here!");
		System.out.println ("Wrapping up.");

	} // method main

} // class Temperature

