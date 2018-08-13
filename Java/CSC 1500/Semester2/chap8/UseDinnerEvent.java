// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// UseDinnerEvent.java
// Chapter 8A Page 375
// Known Bugs : None

// Modified UseSimpleEvent so that it creates a DinnerEvent as well as a "plain" Event.

public class UseDinnerEvent

{

   public static void main(String[] args) throws Exception

   {

      Event anEvent = new Event(); // Event object

      System.out.println("A plain event");

      anEvent.setEventGuests();
      anEvent.printEventGuests();

      DinnerEvent aDinnerEvent = new DinnerEvent(); // DinnerEvent object

      System.out.println("An event with dinner");

      aDinnerEvent.setEventGuests();
      aDinnerEvent.setDinnerChoice();
      aDinnerEvent.printEventGuests();
      aDinnerEvent.printDinnerChoice();

   } // method main

} // class UseDinnerEvent

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseDinnerEvent
A plain event
Enter the number of guests at your event 54321
Event Guests: 54321
An event with dinner
Enter the number of guests at your event 23456
Enter dinner choice
b for beef, c for chicken b
Event Guests: 23456
Dinner choice is beef

C:\Program Files\jdk1.2\bin>

*/
