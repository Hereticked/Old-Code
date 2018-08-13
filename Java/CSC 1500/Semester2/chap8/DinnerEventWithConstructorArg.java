// James Poulette
// CSC 1550 03
// 99 - 04 - 11
// DinnerEventWithConstructorArg.java
// Chapter 8B Page 390
// Known Bugs : None

// Child class constructor requires an integer argument which it passes to the 
// parent class constructor.

public class DinnerEventWithConstructorArg extends EventWithConstructorArg

{

   char dinnerChoice;

   public DinnerEventWithConstructorArg (int guests)

   {

      super (guests); // guests passed to superclass constructor

   } // constructor DinnerEventWithConstructorArg

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

} // class DinnerEventWithConstructorArg
