// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// PlanMenuWithStackTrace.java
// Chapter 12B Pages 571 - 572
// Known Bugs : None

// Traces exceptions through the call stack.

public class PlanMenuWithStackTrace

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

         System.out.println("Stack Trace");
         error.printStackTrace();
         guestChoice = "an invalid selection";

      }

      System.out.println ("You chose " + guestChoice);

   } // method main

} // class PlanMenuWithStackTrace

// Output :

/*

C:\Program Files\jdk1.2\bin>java PlanMenuWithStackTrace
Choose from the following menu :
Type your selection, then press Enter.
Type 1 for Rosemary Chicken
Type 2 for Beef Wellington
Type 3 for Maine Lobster
2
You chose Beef Wellington

C:\Program Files\jdk1.2\bin>java PlanMenuWithStackTrace
Choose from the following menu :
Type your selection, then press Enter.
Type 1 for Rosemary Chicken
Type 2 for Beef Wellington
Type 3 for Maine Lobster
5
Stack Trace
java.lang.ArrayIndexOutOfBoundsException: 4
        at Menu.getSelection(Menu.java:36)
        at PickMenu.setGuestChoice(Compiled Code)
        at PickMenu.<init>(PickMenu.java:23)
        at PlanMenuWithStackTrace.main(PlanMenuWithStackTrace.java:26)
You chose an invalid selection

C:\Program Files\jdk1.2\bin>

*/