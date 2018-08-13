// James Poulette
// CSC 1550 03
// 99 - 02 - 15
// EverySum.java   Page 195 #5
// Known Bugs : None

// Prints a sequence of numbers.

public class EverySum {

   public static void main(String[] args) {

      int num1, num2, num3;

      for(num1 = 1; num1 < 50; ++num1) {

         num2 = num1;

         for(num3 = 0; num2 > 0; --num2) {

            num3 = num3 + num2;

         }

         System.out.print(num3 + "  ");

      }  

   } // method main

} // class EverySum

// Output :

/*

C:\Program Files\JDK\bin>java EverySum
1  3  6  10  15  21  28  36  45  55  66  78  91  105  120  136  153  171  190  2
10  231  253  276  300  325  351  378  406  435  465  496  528  561  595  630  6
66  703  741  780  820  861  903  946  990  1035  1081  1128  1176  1225
C:\Program Files\JDK\bin>

*/
