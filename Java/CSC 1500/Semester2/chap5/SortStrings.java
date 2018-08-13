// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// SortStrings.java pages 252 - 253
// Known Bugs : None

// Sorts an array of names and displays them in order.

public class SortStrings

{

   public static void main(String[]args)

   {

      String[] students = {"Kim", "Ken", "Tom", "Kathy", "Brad"};

      int x;

      System.out.println("Before sort");

      for(x = 0; x < 5; ++x)

         System.out.println(students[x]);

      sortStrings(students, students.length);

      System.out.println("\nAfter sort");

      for(x = 0; x < 5; ++x)

         System.out.println(students[x]);

   }

   public static void sortStrings(String[] array, int len)

   {

      int a,b;
      String temp;
      int highSubscript = len - 1;

      for(a = 0; a < highSubscript; ++a)

      {

         for(b = 0; b < highSubscript; ++b)

            if(array[b].compareTo(array[b + 1]) > 0)

            {

               temp = array[b];
               array[b] = array[b + 1];
               array[b + 1] = temp;

            }

      }

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java SortStrings
Before sort
Kim
Ken
Tom
Kathy
Brad

After sort
Brad
Kathy
Ken
Kim
Tom

C:\Program Files\JDK\bin>

*/
