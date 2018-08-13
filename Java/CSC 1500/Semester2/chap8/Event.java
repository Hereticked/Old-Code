// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// Event.java
// Chapter 8A Page 372
// Known Bugs : None

// Support class created to demonstrate inheritance concepts.

public class Event

{

   private int eventGuests;

   public void printEventGuests()

   {

      System.out.println("Event Guests: " + eventGuests);

   } // method printEventGuests

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

} // class Event
