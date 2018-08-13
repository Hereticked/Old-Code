// James Poulette   CSC 1500 03

// Defining a Java class.

class Rectangle {

   private final int MAX_LEVEL = 100;   // max shading level
   private final int MIN_LEVEL = 0;     // min shading level
   private int length, width, shade;

   public Rectangle (int side1, int side2, int level) {
      length = side1;
      width = side2;
      shade = level;
   }   // constructor Rectangle

   public int area () {
      return length * width;
   }   // method area

   public void set_shade (int adjustment) {
      int new_level = shade + adjustment;
   
      if (new_level >= MIN_LEVEL)
         if (new_level <= MAX_LEVEL)
            shade = new_level;
         else
            System.out.println ("New shading level is too high.");
      else
         System.out.println ("New shading level is too low.");
   }   // method set_shade

}   // class Rectangle
