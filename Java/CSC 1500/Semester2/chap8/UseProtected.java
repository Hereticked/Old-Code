// James Poulette
// CSC 1550 03
// 99 - 04 - 11
// UseProtected.java
// Chapter 8B Page 397
// Known Bugs : None

// Demo program to show use of the "protected" modifier.

public class UseProtected

{

   public static void main (String[] args) throws Exception

   {

      DinnerEventWithProtectedData aDinnerEvent = new DinnerEventWithProtectedData();

      aDinnerEvent.printHeader();
      aDinnerEvent.setEventGuests();
      aDinnerEvent.setDinnerChoice();
      aDinnerEvent.printEventGuests();
      aDinnerEvent.printDinnerChoice();

   } // method main

} // class UseProtected

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseProtected
Dinner event:
Enter the number of guests at your event 12345
Enter dinner choice
b for beef, c for chicken b
Event Guests: 12345
Dinner choice is beef

C:\Program Files\jdk1.2\bin>

*/
