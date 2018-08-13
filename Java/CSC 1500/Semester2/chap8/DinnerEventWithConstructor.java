// James Poulette
// CSC 1550 03
// 99 - 04 - 10
// DinnerEventWithConstructor.java
// Chapter 8B Page 387
// Known Bugs : None

// Dinner Event that extends the EventWithConstructor class.

public class DinnerEventWithConstructor extends EventWithConstructor

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
      System.out.print("b for beef, c for chicken  ");

      dinnerChoice = (char)System.in.read();

      System.in.read();
      System.in.read();

   } // method setDinnerChoice

} // class DinnerEventWithConstructor
