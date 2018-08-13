// James Poulette   CSC 1500 03

// Reads strings, allowing the user to enter the input on
// the same line as the prompt.

import java.io.*;

class Python {

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		String name, quest, color;

		System.out.print ("What is your name? ");
		System.out.flush();
		name = stdin.readLine();

		System.out.print ("What is your quest? ");
		System.out.flush();
		quest = stdin.readLine();

		System.out.print ("What is your favorite color? ");
		System.out.flush();
		color = stdin.readLine();

		System.out.println ("Name: " + name);
		System.out.println ("Quest: " + quest);
		System.out.println ("Color: " + color);

	} // method main

} // class Python				


		 
		

		