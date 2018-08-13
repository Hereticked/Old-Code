// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// UseEventsWithConstructors.java
// Chapter 8B Page 388
// Known Bugs : None

// Demonstrates the use of the base class constructor with both a base class object and an
// extended class object.

public class UseEventsWithConstructors

{

   public static void main(String[] args)

   {

       EventWithConstructor anEvent = new EventWithConstructor();
       DinnerEventWithConstructor aDinnerEvent = new DinnerEventWithConstructor();

       anEvent.printHeader(); // anEvent is a parent class member
       anEvent.printEventGuests();
       aDinnerEvent.printHeader(); // aDinnerEvent is a child class member
       aDinnerEvent.printEventGuests();

   } // method main

} // class UseEventsWithConstructors

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseEventsWithConstructors
Simple Event:
Event Guests: 0
Dinner event:
Event Guests: 0

C:\Program Files\jdk1.2\bin>

*/
