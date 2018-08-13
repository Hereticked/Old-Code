// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// Menu.java
// Chapter 12B Pages 563 - 564
// Known Bugs : None

// Lists dinner choices and returns the name of the selected choice.

public class Menu

{

   String[] entreeChoice = {"Rosemary Chicken", "Beef Wellington", "Maine Lobster"};

   public void displayMenu()

   {

      System.out.println ("Type your selection, then press Enter.");

      for (int x = 0; x < entreeChoice.length; ++x)

      {

         System.out.println ("Type " + (x + 1) + " for " + entreeChoice[x]);

      }

   } // method displayMenu

   public String getSelection (int x)

   {

      return (entreeChoice[x - 1]);

   } // method getSelection

} // class Menu