// James Poulette
// CSC 1550 03
// 99 - 04 - 11
// EventWithProtectedData.java
// Chapter 8B Page 395
// Known Bugs : None

// Support class for UseProtected class.

public class EventWithProtectedData

{

   protected int eventGuests;

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

} // class EventWithProtectedData
