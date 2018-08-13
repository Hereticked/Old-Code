// James Poulette
// CSC 1550 03
// 99 - 03 - 07
// ValueArray.java   Page 225   #4
// Known Bugs : None

// Sticks some numbers in an array and displays statistics about them.

import java.text.*;

public class ValueArray

{

   public static void main(String[]args)

   {

      double[] values = {0.12, 1.23, 2.34, 3.45, 4.56, 5.67, 6.78, 7.89, 8.90, 9.00,
			 10.12, 11.23, 12.34, 13.45, 14.56, 15.67, 16.78, 17.89, 18.90, 19.00};

      DecimalFormat df1 = new DecimalFormat ("####0.00");

      int a = 0, b = 0, c = 0, l = (values.length);
      double sum = 0, average = 0;

      for (a = (l - 1); a >= 0; --a) {

         sum = sum + (values[a]);

      }

      System.out.println();
      System.out.println("The sum of all the values is " + df1.format(sum));
      System.out.println();
      System.out.print("The values that are less than 5.0 : (  ");

      for (b = (l - 1); b >= 0; --b) {

         if ((values[b]) < 5.0) {

            System.out.print(df1.format(values[b]) + "  ");

         }

      }

      System.out.println(")");

      average = (sum / l);

      System.out.println();
      System.out.print("Values that are greater than the average value : (  ");

      for (c = (l - 1); c >= 0; --c) {       

         if ((values[c]) > average) {

            System.out.print(df1.format(values[c]) + "  ");

         }

      }

      System.out.println(")");

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java ValueArray

The sum of all the values is 199.88

The values that are less than 5.0 : (  4.56  3.45  2.34  1.23  0.12  )

Values that are greater than the average value : (  19.00  18.90  17.89  16.78
15.67  14.56  13.45  12.34  11.23  10.12  )

C:\Program Files\JDK\bin>

*/
