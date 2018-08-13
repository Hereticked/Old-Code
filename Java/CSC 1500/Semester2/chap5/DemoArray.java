// James Poulette
// CSC 1550 03
// 99 - 03 - 01
// DemoArray.java   Pages 201 - 204 
// Known Bugs : None

// Creates an array and displays the values stored in it.

public class DemoArray

{

   public static void main(String[]args)

   {

      double[] salary = {5.25, 6.55, 10.25, 16.85};

      System.out.println("Salaries one by one are:");

      for(int x = 0; x < 4; ++x)

         System.out.println(salary[x]);

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java DemoArray
Salaries one by one are:
5.25
6.55
10.25
16.85

C:\Program Files\JDK\bin>

*/
