// James Poulette
// CSC 1550 03
// 99 - 03 - 07
// NumInput.java   Pages 237 - 238
// Known Bugs : None

// Prompts user to enter a number and gives a warning if the number is over 100.

public class NumInput

{

   public static void main(String[]args) throws Exception

   {

      String inputString = new String();

      char newChar;

      int inputNumber;

      System.out.println("Enter the number of guests at your event");

      newChar = (char)System.in.read();

      while(newChar >= '0' && newChar <= '9')

      {

         inputString = inputString + newChar;
         newChar = (char)System.in.read();

      }

      System.in.read();

      inputNumber = Integer.parseInt(inputString);

      if(inputNumber > 100)

         System.out.println("A surcharge will apply!");

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java NumInput
Enter the number of guests at your event
65

C:\Program Files\JDK\bin>java NumInput
Enter the number of guests at your event
101
A surcharge will apply!

C:\Program Files\JDK\bin>

*/
