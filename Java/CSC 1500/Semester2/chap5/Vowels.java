// James Poulette
// CSC 1550 03
// 99 - 03 - 07
// Vowels.java   page 242   #7
// Known Bugs : None

// Counts and displays the number of vowels in each of the names listed in the string array.

public class Vowels

{

   public static void main(String[]args)

   {

      String[] names = {"James", "Jacqueline", "Patricia", "Earl", "Lucy"};

      int a, b, counter;

      for(a = 0; a <= ((names.length) - 1); ++a)

      {

         counter = 0;

         for(b = 0; b <= ((names[a].length()) - 1); ++b)

         {

            switch (names[a].charAt(b))

            {

               case ('a') : ++counter;
	          break;
	       case ('e') : ++counter;
	          break;
               case ('i') : ++counter;
	          break;
               case ('o') : ++counter;
	          break;
	       case ('u') : ++counter;
	          break;
               case ('A') : ++counter;
	          break;
	       case ('E') : ++counter;
	          break;
               case ('I') : ++counter;
	          break;
               case ('O') : ++counter;
	          break;
	       case ('U') : ++counter;

            }

         }

         System.out.println("The name " + names[a] + " contains " + counter + " vowels.");

      }  

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java Vowels
The name James contains 2 vowels.
The name Jacqueline contains 5 vowels.
The name Patricia contains 4 vowels.
The name Earl contains 2 vowels.
The name Lucy contains 1 vowels.

C:\Program Files\JDK\bin>

*/
