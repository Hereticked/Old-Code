// James Poulette
// CSC 1550 03
// 99 - 02 - 15
// Perfect.java   Page 195 #6
// Known Bugs : None

// Displays the perfect numbers in the 1 - 1000 range.

public class Perfect {

   public static void main(String[] args) {

      int num1 = 0, num2 = 0, count;

      for(count = 1; count < 1000; ++count) {

         num2 = 0;

         for(num1 = count; num1 >= 2; --num1) {

            if((count%num1) == 0)

               num2 = num2 + (count / num1);
           
         }

         if(num2 == count)
            System.out.print(count + "  ");

      }

   } // method main

} // class Perfect

// Output :

/*

C:\Program Files\JDK\bin>java Perfect
6  28  496
C:\Program Files\JDK\bin>

*/
