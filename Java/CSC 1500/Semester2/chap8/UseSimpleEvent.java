// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// UseSimpleEvent.java
// Chapter 8A Page 373
// Known Bugs : None

// Simple application that uses the Event class.

public class UseSimpleEvent

{

   public static void main(String[] args) throws Exception

   {

       Event anEvent = new Event(); // Event object
       anEvent.setEventGuests();
       anEvent.printEventGuests();

   } // method main

} // class UseSimpleEvent

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseSimpleEvent
Enter the number of guests at your event 12345
Event Guests: 12345

C:\Program Files\jdk1.2\bin>

*/
