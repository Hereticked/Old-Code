// James Poulette   CSC 1500 03

// Determine the average and maximum grade of a set of test scores.

import java.io.*;

class Average {

	public static void main (String[] args) throws IOException {

		int grade, count = 0, sum = 0, max, average;

		BufferedReader stdin = new BufferedReader

			(new InputStreamReader(System.in));

		// Get the first grade. Give max that initial value.

		System.out.print ("Enter the first grade (-1 to quit): ");
		System.out.flush();
		grade = Integer.parseInt(stdin.readLine());

		max = grade;

		// Read and process the rest of the grades.

		while (grade >= 0) {
			count = count + 1;
			sum = sum + grade;
			if (grade > max)
				max = grade;
			System.out.print ("Enter the next grade (-1 to quit): ");
			System.out.flush();
			grade = Integer.parseInt (stdin.readLine());
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

} // class Average