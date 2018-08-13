// James Poulette   CSC 1550 03   99 - 02 - 07

// Box.java   Page 111   #4

// Demonstrates overloading using 3 constructors.

public class Box {

   public static void define(int l) {

      int length, width, height;

      length = l;
      width = 0;
      height = 0;

      System.out.println();
      System.out.println("Length = " + length);
      System.out.println("Width = " + width);
      System.out.println("Height = " + height);
      System.out.println();
      System.out.println("Line created");

   } // method define

   public static void define(int l, int w) {

      int length, width, height;

      length = l;
      width = w;
      height = 0;

      System.out.println();
      System.out.println("Length = " + length);
      System.out.println("Width = " + width);
      System.out.println("Height = " + height);
      System.out.println();
      System.out.println("Rectangle created");

   } // method define

   public static void define(int l, int w, int h) {

      int length, width, height;

      length = l;
      width = w;
      height = h;

      System.out.println();
      System.out.println("Length = " + length);
      System.out.println("Width = " + width);
      System.out.println("Height = " + height);
      System.out.println();
      System.out.println("Box created");

   } // method define

} // class Box
