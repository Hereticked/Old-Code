// James Poulette
// CSC 1550 03
// 99 - 03 - 07
// Vowel.java   page 242   #1
// Known Bugs : None

// Asks users to enter a character and tells user if it's a vowel.

public class Vowel

{

   public static void main(String[]args) throws Exception

   {

      char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

      char input;

      int x;

      System.out.print("Enter a character : ");

      input = (char)System.in.read();

      for(x = 0; x <= ((vowels.length) - 1); ++x)

         if(input == vowels[x])

            System.out.println(input + " is a vowel!");

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java Vowel
Enter a character : a
a is a vowel!

C:\Program Files\JDK\bin>java Vowel
Enter a character : E
E is a vowel!

C:\Program Files\JDK\bin>java Vowel
Enter a character : b

C:\Program Files\JDK\bin>

*/
