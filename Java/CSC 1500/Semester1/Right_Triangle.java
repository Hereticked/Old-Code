// James Poulette   CSC 1500 03

// A program to determine if the length of the sides of a
// triangle represent a right triangle.

import java.io.*;

class Right_Triangle {

	public static void main (String[] args) throws IOException {

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		int hypotenuse_sq; // calculated hypotenuse squared

		System.out.println ("Enter side 1:");
		int side1 = Integer.parseInt (stdin.readLine());
		System.out.println ("Enter side 2:");
		int side2 = Integer.parseInt (stdin.readLine());
		System.out.println ("Enter the hypotenuse:");
		int side3 = Integer.parseInt (stdin.readLine());

		hypotenuse_sq = (side1 * side1) + (side2 * side2);
		if ((side3 * side3) == hypotenuse_sq)
			System.out.println ("It is a right triangle.");
		else
			System.out.println ("It is not a right triangle.");

	} // method main

} // class Right_Triangle