// James Poulette
// CSC 1550 03
// 99 - 04 - 11
// UseEventsWithConstructorArg.java
// Chapter 8B Page 390
// Known Bugs : None

// Demonstrates creating parent and child class objects when the parent constructor
// needs an argument.

public class UseEventsWithConstructorArg

{

   public static void main(String[] args)

   {

       EventWithConstructorArg anEvent = new EventWithConstructorArg(45);
       DinnerEventWithConstructorArg aDinnerEvent = new DinnerEventWithConstructorArg(65);

       anEvent.printHeader(); // anEvent is a parent class member
       anEvent.printEventGuests();
       aDinnerEvent.printHeader(); // aDinnerEvent is a child class member
       aDinnerEvent.printEventGuests();

   } // method main

} // class UseEventsWithConstructorArg

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseEventsWithConstructorArg
Simple Event:
Event Guests: 45
Dinner event:
Event Guests: 65

C:\Program Files\jdk1.2\bin>

*/
