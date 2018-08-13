// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// EventWithConstructor.java
// Chapter 8B Page 387
// Known Bugs : None

// Adds a constructor to the Event class.

public class EventWithConstructor

{

   private int eventGuests;

   public EventWithConstructor()

   {

      eventGuests = 0;

   } // constructor EventWithConstructor


   public void printEventGuests()

   {

      System.out.println("Event Guests: " + eventGuests);

   } // method printEventGuests

   public void printHeader()

   {

      System.out.println("Simple Event: ");

   } // method printHeader

   public void setEventGuests() throws Exception

   {

      char inChar;
      String guestsString = new String("");

      System.out.print("Enter the number of guests at your event ");

      inChar = (char)System.in.read();

      while(inChar >= '0' && inChar <= '9')

      {

         guestsString = guestsString + inChar;
         inChar = (char)System.in.read();

      }

      eventGuests = Integer.parseInt(guestsString);
      System.in.read();

   } // method setEventGuests

} // class EventWithConstructor
