// James Poulette   CSC 1550 03   99 - 02 - 04

// Salary.java   Page 44  #14

// A relatively useless program that calculates a weekly salary.

import java.text.*;

class Salary {

	public static void main (String[] args) {

		double sal, newsal;
		int rhours, ohours;

      		DecimalFormat df1 = new DecimalFormat ("####.00");

		sal = 25.0;
		rhours = 40;
		ohours = 13;

		newsal = calculate(sal, rhours, ohours);
		        
		System.out.println ();
		System.out.println ("The weekly salary of this employee will be : $" + df1.format(newsal));

	} // method main

	private static double calculate (double amount, int h1, int h2) {

		double wages;
	
		wages = (amount * h1) + ((amount * 1.5) * h2);

		return wages;

	} // method calculate

} // class Salary
