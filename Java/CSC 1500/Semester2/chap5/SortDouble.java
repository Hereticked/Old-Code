// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// SortDouble.java   pages 263   #1
// Known Bugs : None

// Sorts an array of doubles and displays them in ascending and descending order.

public class SortDouble

{

   public static void main(String[]args)

   {

      double[] values = {0.12, 13.45, 2.34, 11.23, 4.56, 7.89, 6.78, 5.67, 8.90, 9.00,
			 10.12, 3.45, 12.34, 1.23, 14.56};

      int x;

      System.out.println("List in original order :");

      for(x = 0; x < values.length; ++x)

         System.out.print(values[x] + " ");

      System.out.println();
      System.out.println("List in ascending order :");

      ascend(values, (values.length - 1));

      for(x = 0; x < values.length; ++x)

         System.out.print(values[x] + " ");

      System.out.println();
      System.out.println("List in descending order :");

      descend(values, (values.length - 1));

      for(x = 0; x < values.length; ++x)

         System.out.print(values[x] + " ");

      System.out.println();

   }

   public static void ascend(double[] array, int len)

   {

      int a, b, c = len, d = len;
      double temp = 0;

      for(a = 0; a < c; ++a)

      {

         for(b = 0; b < d; ++b)

         {

            if(array[b] > array[b + 1])

            {

               temp = array[b];
               array[b] = array[b + 1];
               array[b + 1] = temp;

            }

         }

         --d;

      }

   }

   public static void descend(double[] array, int len)

   {

      int a, b, c = len, d = len;
      double temp = 0;

      for(a = 0; a < c; ++a)

      {

         for(b = 0; b < d; ++b)

         {

            if(array[b] < array[b + 1])

            {

               temp = array[b];
               array[b] = array[b + 1];
               array[b + 1] = temp;

            }

         }

         --d;

      }

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java SortDouble
List in original order :
0.12 13.45 2.34 11.23 4.56 7.89 6.78 5.67 8.9 9.0 10.12 3.45 12.34 1.23 14.56
List in ascending order :
0.12 1.23 2.34 3.45 4.56 5.67 6.78 7.89 8.9 9.0 10.12 11.23 12.34 13.45 14.56
List in descending order :
14.56 13.45 12.34 11.23 10.12 9.0 8.9 7.89 6.78 5.67 4.56 3.45 2.34 1.23 0.12

C:\Program Files\JDK\bin>

*/
