// James Poulette
// CSC 1550 03   
// 99 - 02 - 08
// UsersInitials.java   Pages 139 - 140
// Known Bugs : None

// Reads in your initials and displays them.

public class UsersInitials {

   public static void main(String[] args) throws Exception {

      char firstInit, middleInit, lastInit;

      System.out.print("Enter your first initial and press enter. ");

      firstInit = (char)System.in.read();

      System.in.read(); 
      System.in.read();
      
      System.out.print("Enter your second initial and press enter. ");

      middleInit = (char)System.in.read();

      System.in.read();
      System.in.read();

      System.out.print("Enter your third initial and press enter. ");

      lastInit = (char)System.in.read();

      System.out.println("Your initials are " + firstInit + middleInit + lastInit);

   } // method main

} // class UsersInitials

// Output :

/*

C:\Program Files\JDK\bin>java UsersInitials
Enter your first initial and press enter. J
Enter your second initial and press enter. A
Enter your third initial and press enter. P
Your initials are JAP

C:\Program Files\JDK\bin>

*/
