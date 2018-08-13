// James Poulette   CSC 1550 03   99 - 02 - 04

// DemoVariables.java   Page 28   Grey Box #2

// A REALLY boring program full of stuff I already knew.

public class DemoVariables {

	public static void main (String[] args) {

		int oneInt = 315;
		short oneShort = 23;
		long oneLong = 123456789876543L;
		int value1 = 43, value2 = 10, sum, difference, product, quotient, modulus;
		boolean isProgrammingFun = true, isProgrammingHard = false;
		double doubNum1 = 2.3, doubNum2 = 14.8, doubResult;

		sum = value1 + value2;
		difference = value1 - value2;
		product = value1 * value2;
		quotient = value1 / value2;
		modulus = value1 % value2;
		doubResult = doubNum1 + doubNum2;

		System.out.println();
		System.out.println("The int is " + oneInt);
		System.out.println("The short is " + oneShort);
		System.out.println("The long is " + oneLong);
		System.out.println("Sum is " + sum);
		System.out.println("Difference is " + difference);
		System.out.println("Product is " + product);
		System.out.println("Quotient is " + quotient);
		System.out.println("Modulus is " + modulus);
		System.out.println("The value of isProgrammingFun is " + isProgrammingFun);
		System.out.println("The value of isProgrammingHard is " + isProgrammingHard);
		System.out.println("The sum of the doubles is " + doubResult);
		
		doubResult = doubNum1 * doubNum2;

		System.out.println("The product of the doubles is " + doubResult);
		System.out.println("\nThis is on one line\nThis is on another");
		System.out.println("This shows\thow\ttabs\twork");

	} // method main

} // class DemoVariables
