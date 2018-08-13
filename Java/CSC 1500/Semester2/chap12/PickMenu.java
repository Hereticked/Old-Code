// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// PickMenu.java
// Chapter 12B Pages 564 - 566
// Known Bugs : None

// Lets the customer choose from the list of dinner options and returns the choice.

public class PickMenu

{

   Menu briefMenu;
   int choice;
   String guestChoice = new String();

   public PickMenu (Menu theMenu) throws Exception

   {

      briefMenu = theMenu;
      setGuestChoice();

   } // method PickMenu

   public void setGuestChoice() throws Exception

   {

      char newChar;
      String inputString = new String();

      System.out.println("Choose from the following menu :");

      briefMenu.displayMenu();

      newChar = (char)System.in.read();

      while (newChar >= '0' && newChar <= '9')

      {

         inputString = inputString + newChar;
         newChar = (char)System.in.read();

      }

      System.in.read();

      choice = Integer.parseInt(inputString);
      guestChoice = briefMenu.getSelection(choice);

   } // method setGuestChoice

   public String getGuestChoice()

   {

      return (guestChoice);

   } // method getGuestChoice

} // class PickMenu