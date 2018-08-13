// James Poulette
// CSC 1550 03
// 99 - 03 - 01
// DisplayOrder.java   Page 225   #1
// Known Bugs : None

// Sticks some numbers in an array and displays them in a certain order.

public class DisplayOrder

{

   public static void main(String[] args)

   {

      int[] Array = {1, 2, 3, 4, 5};

      for(int y = 0; y <= ((Array.length) - 1); ++y)

         System.out.println(Array[y]);

      for(int x = ((Array.length) - 1); x >= 0; --x)

         System.out.println(Array[x]);

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java DisplayOrder
1
2
3
4
5
5
4
3
2
1

C:\Program Files\JDK\bin>

*/
