// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// DinnerEvent.java
// Chapter 8A Page 374
// Known Bugs : None

// Child class of Event that serves dinner.

public class DinnerEvent extends Event

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

   public void setDinnerChoice() throws Exception

   {

      System.out.println("Enter dinner choice");
      System.out.print("b for beef, c for chicken ");

      dinnerChoice = (char)System.in.read();

      System.in.read();
      System.in.read();

   } // method setDinnerChoice

} // class DinnerEvent
