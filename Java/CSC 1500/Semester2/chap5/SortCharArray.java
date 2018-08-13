// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// SortCharArray.java   pages 247 - 249
// Known Bugs : None

// Prompts the user to fill an array with characters and then sorts them and displays
// them in ascending order.

public class SortCharArray

{

   public static void main(String[]args) throws Exception

   {

      char[] someChars = new char[10];

      int x;

      for(x = 0; x < someChars.length; ++x)

      {

         System.out.print("Enter a character ");
         someChars[x] = (char)System.in.read();
         System.in.read();
         System.in.read();

      }

      System.out.println("Before sort");

      for(x = 0; x < someChars.length; ++x)

         System.out.print(someChars[x] + " ");

      bubbleSort(someChars, someChars.length);

      System.out.println("\nAfter sort");

      for(x = 0; x < someChars.length; ++x)

         System.out.print(someChars[x] + " ");

      System.out.println();

   }

   public static void bubbleSort(char[] array, int len)

   {

      int a,b;
      char temp;
      int highSubscript = len - 1;
      int compsToMake = len - 1;

      for(a = 0; a < highSubscript; ++a)

      {

         for(b = 0; b < compsToMake; ++b)

            if(array[b] > array[b + 1])

            {

               temp = array[b];
               array[b] = array[b + 1];
               array[b + 1] = temp;

            }

         --compsToMake;

      }

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java SortCharArray
Enter a character p
Enter a character f
Enter a character h
Enter a character e
Enter a character n
Enter a character g
Enter a character b
Enter a character m
Enter a character x
Enter a character u
Before sort
p f h e n g b m x u
After sort
b e f g h m n p u x

C:\Program Files\JDK\bin>

*/
