public class SnakeEyes {

   public static void main(String[] args) {

   int die1;
   int die2;
   int total = 0;
   int counter = 0;

      while (total != 2) {

         die1 = (int)(Math.random()*6) + 1;
         die2 = (int)(Math.random()*6) + 1;
         counter++;
         total = die1 + die2;

      }

   System.out.println("Snake Eyes after " + counter + " rolls.");

   }

}


// Rolls dice until Snake Eyes and counts the rolls it took to get it.