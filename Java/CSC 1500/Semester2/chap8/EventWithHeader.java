// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// EventWithHeader.java
// Chapter 8A Page 378
// Known Bugs : None

// Demonstrates that subclass methods override superclass methods with the same name.
// This is the superclass.

public class EventWithHeader

{

   private int eventGuests;

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

} // class EventWithHeader
