// James Poulette   CSC 1550 03   99 - 02 - 07

// SetUpSite.java   Page 50   Grey Box #3

// Uses a complicated process involving several methods to accomplish something that could
// easily be done in the main method with just a few statements.
 
public class SetUpSite {

   public static void main (String[] args) {

      EventSite oneSite = new EventSite();

      int number;

      oneSite.setSiteNumber(101);

      int currentYear = 2000;
      int age;

      statementOfPhilosophy();
      age = calculateAge(currentYear);

      System.out.println("Serving you for " + age + " years");

      number = oneSite.getSiteNumber();

      System.out.println("The number of the event site is " + number);

   } // method main

   public static void statementOfPhilosophy() {

      System.out.println("Event Handlers Incorporated is");
      System.out.println("dedicated to making your event");
      System.out.println("a most memorable one.");

   } // method statementOfPhilosophy

   public static int calculateAge(int currDate) {

      int yrs;
      yrs = currDate - 1977;
      return yrs;

   } // method calculateAge

} // class SetUpSite
