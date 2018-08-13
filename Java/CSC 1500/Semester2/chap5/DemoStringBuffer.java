// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// DemoStringBuffer.java   pages 259 - 260
// Known Bugs : None

// Messes around with a string.

public class DemoStringBuffer

{

   public static void main(String[]args)

   {

      StringBuffer str = new StringBuffer("singing");
      print(str);

      str.append(" in the dead of ");
      print(str);

      str.insert(0, "Black");
      print(str);
      str.insert(5, "bird ");
      print(str);

      str.append("night");
      print(str);

   }

   public static void print(StringBuffer s)

   {

      System.out.println(s);

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java DemoStringBuffer
singing
singing in the dead of
Blacksinging in the dead of
Blackbird singing in the dead of
Blackbird singing in the dead of night

C:\Program Files\JDK\bin>

*/
