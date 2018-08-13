class Fibonacci {

   public static void main (String[] args) {

      int fibNum0 = 1;
      int fibNum1 = 1;
      int fibResult;

      System.out.println("Fibonacci number 0 = " + fibNum0);
      System.out.println("Fibonacci number 1 = " + fibNum1);


      for(int fibCount=2; fibCount<31; fibCount++){

         fibResult = fibNum0 + fibNum1;

         System.out.println("Fibonacci number " + fibCount + " = " + fibResult);

         fibNum0 = fibNum1;
         fibNum1 = fibResult;

      }

   }

}