// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// DinnerEventWithHeader.java
// Chapter 8A Page 378
// Known Bugs : None

// Demonstrates that subclass methods override superclass methods with the same name.
// This is the subclass.

public class DinnerEventWithHeader extends EventWithHeader

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

} // class DinnerEventWithHeader
