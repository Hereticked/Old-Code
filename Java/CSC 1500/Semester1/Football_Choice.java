// James Poulette   CSC 1500 03

// Uses a nested if to print one of three messages. 

import java.io.*;

class Football_Choice {

	final static int HEADS = 1;
	final static int RECEIVE = 1;

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		System.out.println ("Enter 1 for heads or 2 for tails:");
		int coin = Integer.parseInt (stdin.readLine());
		System.out.println ("Enter 1 to receive and 2 to kickoff:");
		int choice = Integer.parseInt (stdin.readLine());

		if (coin == HEADS)
			if (choice == RECEIVE)
				System.out.println ("You won the toss and will receive.");
			else
				System.out.println ("You won the toss and will kickoff.");
		else
			System.out.println ("You lost the coin toss.");

	} // method main

} // class Football_Choice 