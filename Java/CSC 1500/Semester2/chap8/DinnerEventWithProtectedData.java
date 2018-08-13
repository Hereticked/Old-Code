// James Poulette
// CSC 1550 03
// 99 - 04 - 11
// DinnerEventWithProtectedData.java
// Chapter 8B Page 396
// Known Bugs : None

// Support class for UseProtected class.

public class DinnerEventWithProtectedData extends EventWithProtectedData

{

   char dinnerChoice;

   public void printDinnerChoice()

   {

      if (dinnerChoice == 'b')

      {

        System.out.println("Dinner choice is beef");

      }

      else

      {

        System.out.println("Dinner choice is chicken");

      }

   } // method printDinnerChoice

   public void printHeader()

   {

      System.out.println("Dinner event: ");

   } // method printHeader

   public void setDinnerChoice() throws Exception

   {

      System.out.println("Enter dinner choice");
      System.out.print("b for beef, c for chicken ");

      dinnerChoice = (char)System.in.read();

      System.in.read();
      System.in.read();

   } // method setDinnerChoice

   public void setEventGuests() throws Exception

   {

      super.setEventGuests();

      while (eventGuests < 10)

      {

         System.out.print("Minimum required for dinner: ");
         System.out.println("10 guests!");

         super.setEventGuests();

      }

   } // method setEventGuests

} // class DinnerEventWithProtectedData
