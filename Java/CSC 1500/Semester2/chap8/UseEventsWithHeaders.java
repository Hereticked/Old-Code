// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// UseEventsWithHeaders.java
// Chapter 8A Page 379
// Known Bugs : None

// Demonstrates that child class methods override parent class methods with the same name.

public class UseEventsWithHeaders

{

   public static void main(String[] args) throws Exception

   {

       EventWithHeader anEvent = new EventWithHeader();
       DinnerEventWithHeader aDinnerEvent = new DinnerEventWithHeader();

       anEvent.printHeader();
       anEvent.setEventGuests();
       anEvent.printEventGuests();

       aDinnerEvent.printHeader();
       aDinnerEvent.setEventGuests();
       aDinnerEvent.setDinnerChoice();
       aDinnerEvent.printEventGuests();
       aDinnerEvent.printDinnerChoice();

   } // method main

} // class UseEventsWithHeaders

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseEventsWithHeaders
Simple Event:
Enter the number of guests at your event 12345
Event Guests: 12345
Dinner event:
Enter the number of guests at your event 54321
Enter dinner choice
b for beef, c for chicken c
Event Guests: 54321
Dinner choice is chicken

C:\Program Files\jdk1.2\bin>

*/
