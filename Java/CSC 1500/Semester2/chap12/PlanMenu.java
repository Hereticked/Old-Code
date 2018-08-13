// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// PlanMenu.java
// Chapter 12B Pages 566 - 568
// Known Bugs : None

// Uses the PickMenu class and can catch exceptions that PickMenu throws.

public class PlanMenu

{

   public static void main (String[] args)

   {

      Menu briefMenu = new Menu();
      PickMenu entree = null;
      String guestChoice = new String();

      try

      {

         PickMenu selection = new PickMenu (briefMenu);
         entree = selection;
         guestChoice = entree.getGuestChoice();

      }

      catch (Exception error)

      {

         guestChoice = "an invalid selection";

      }

      System.out.println ("You chose " + guestChoice);

   } // method main

} // class PlanMenu

// Output :

/*

C:\Program Files\jdk1.2\bin>java PlanMenu
Choose from the following menu :
Type your selection, then press Enter.
Type 1 for Rosemary Chicken
Type 2 for Beef Wellington
Type 3 for Maine Lobster
1
You chose Rosemary Chicken

C:\Program Files\jdk1.2\bin>java PlanMenu
Choose from the following menu :
Type your selection, then press Enter.
Type 1 for Rosemary Chicken
Type 2 for Beef Wellington
Type 3 for Maine Lobster
2
You chose Beef Wellington

C:\Program Files\jdk1.2\bin>java PlanMenu
Choose from the following menu :
Type your selection, then press Enter.
Type 1 for Rosemary Chicken
Type 2 for Beef Wellington
Type 3 for Maine Lobster
gimme food
You chose an invalid selection

C:\Program Files\jdk1.2\bin>

*/