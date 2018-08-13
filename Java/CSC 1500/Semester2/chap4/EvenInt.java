// James Poulette
// CSC 1550 03
// 99 - 02 - 15
// EvenInt.java   Pages 187 - 190
// Known Bugs : None

// Uses for loops to display the divisors of the numbers 1 - 100.

public class EvenInt {

   public static void main(String[] args) throws Exception {

      int num, testNum;

      for(testNum = 1; testNum <= 100; ++testNum) {

         System.out.print(testNum + " is evenly divisible by ");

         for(num = 1; num < testNum; ++num)
            if(testNum%num == 0)
               System.out.print(num + "  ");

      System.out.println();

      if(testNum % 20 == 0) {

         System.out.println("Press Enter to continue");

         System.in.read();
         System.in.read();

      }

      }

   } // method main

} // class EvenInt
