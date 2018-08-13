// James Poulette   CSC 1500 03

// Demonstrates the effects possible using parameter passing.

class Num {

   int value;

   public Num(int val) {

      value = val; }

   public String toString() {

      return String.valueOf(value); }

} // class Num

class Par_Pas2 {

   public static void change_values

      (int formal1, int formal2, Num formal3, Num formal4, Num formal5) {
      System.out.println();
      System.out.println ("Before changing values");
      System.out.println ("Formal parameter 1: " + formal1);
      System.out.println ("Formal parameter 2: " + formal2);
      System.out.println ("Formal parameter 3: " + formal3);
      System.out.println ("Formal parameter 4: " + formal4);
      System.out.println ("Formal parameter 5: " + formal5);

      System.out.println();
      System.out.println ("After changing values");
      System.out.println ("Formal parameter 1: " + formal1);
      System.out.println ("Formal parameter 2: " + formal2);
      System.out.println ("Formal parameter 3: " + formal3);
      System.out.println ("Formal parameter 4: " + formal4);
      System.out.println ("Formal parameter 5: " + formal5);

   } // method change_values

   public static void main (String[] args) {

      int actual1 = 6;
      int actual2 = 9;
      Num actual3 = new Num (7);
      Num actual4 = new Num (1);
      Num actual5 = new Num (10);

      System.out.println();
      System.out.println ("Before method call");
      System.out.println ("Actual parameter 1: " + actual1);
      System.out.println ("Actual parameter 2: " + actual2);
      System.out.println ("Actual parameter 3: " + actual3);
      System.out.println ("Actual parameter 4: " + actual4);
      System.out.println ("Actual parameter 5: " + actual5);

      change_values
         (actual1, actual2, actual3, actual4, actual5);

      System.out.println();
      System.out.println ("After method call");
      System.out.println ("Actual parameter 1: " + actual1);
      System.out.println ("Actual parameter 2: " + actual2);
      System.out.println ("Actual parameter 3: " + actual3);
      System.out.println ("Actual parameter 4: " + actual4);
      System.out.println ("Actual parameter 5: " + actual5);

   } // method main

} // class Par_Pas2
      
