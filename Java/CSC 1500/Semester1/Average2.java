// James Poulette   CSC 1500 03

// Determine the average and maximum grade of a set of test scores.
// A second version.

import java.io.*;

class Average2 {

	public static void main (String[] args) throws IOException {

		int grade = 9999, count = 0, max = 0;
		float sum = 0, average;

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		// Read and process all grades.

		while (grade >= 0) {
			System.out.print ("Enter a grade (-1 to quit): ");
			System.out.flush();
			grade = Integer.parseInt(stdin.readLine());

			if (grade >= 0) {
				count = count + 1;
				sum = sum + grade;
				if (grade > max)
					max = grade;
			}
		}
		
		if (count == 0)
			System.out.println ("No valid grades were entered.");
		else {
			average = sum / count;
			System.out.println();
			System.out.println ("Total number of students: " + count);
			System.out.println ("Average grade: " + average);
			System.out.println ("Highest grade: " + max);
		}

	} // method main

} // class Average2