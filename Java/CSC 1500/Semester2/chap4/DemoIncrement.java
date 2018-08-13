// James Poulette
// CSC 1550 03
// 99 - 02 - 15
// DemoIncrement.java   Pages 182 - 183
// Known Bugs : None

// Demonstrates prefix and postfix increment operators.

public class DemoIncrement {

   public static void main(String[] args) throws Exception {

      int v = 4;
      int plusPlusV = ++v;

      v = 4;

      int vPlusPlus = v++;

      System.out.println("v is " + v);
      System.out.println("++v is " + plusPlusV);
      System.out.println("v++ is " + vPlusPlus);

      int w = 17, x = 17, y = 18;
      boolean compare1 = (++w == y);
      boolean compare2 = (x++ == y);

      System.out.println("First compare is " + compare1);
      System.out.println("Second compare is " + compare2);

   } // method main

} // class DemoIncrement

// Output :

/*

C:\Program Files\JDK\bin>java DemoIncrement
v is 5
++v is 5
v++ is 4
First compare is true
Second compare is false

C:\Program Files\JDK\bin>

*/
