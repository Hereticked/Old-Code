class Fibonacci2 {

   public static void main (String[] args) {

      int x = 1;
      int y = 1;
      int fibCount = 45;
      int fibResult;

      System.out.println("Fibonacci #1 is: " + x);
      System.out.println("Fibonacci #2 is: " + y);

      for(int z = 3; z <= fibCount; z++){

         fibResult = x + y;

         x = y;
         y = fibResult;

         System.out.println("Fibonacci #" + z + " is: " + fibResult);

      }

   }

}