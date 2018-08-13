public class HighestDivisor {

   public static void main(String[] args) {

      int numcount = 1;
      int divisor;
      int divisorcount = 0;
      int highestdivisor = 0;
      int winner = 0;
      
      while (numcount < 10001) {

         for (divisor = 1; divisor <= numcount; divisor++) {

            if (numcount % divisor == 0) {

               divisorcount++;

            }

         }

         if (highestdivisor < divisorcount) {

            highestdivisor = divisorcount;
            winner = numcount;

         }

         divisorcount = 0;
         numcount++;

      }

      System.out.println("The number with the most divisors is " + winner + " with " + highestdivisor + " divisors.");

   }

}

// Checks all numbers between 1 and 10,000 to see which has the most divisors.