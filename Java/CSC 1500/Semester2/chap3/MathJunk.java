// James Poulette   CSC 1550 03   99 - 02 - 07

// MathJunk.java   Page 131   #3

// Performs a bunch of weird math junk.

class MathJunk {

   public static void main (String[] args) {

      char blah = 'k';

      System.out.println();
      System.out.println("The square root of 30 is " + (Math.sqrt(30)));
      System.out.println("The sine of 100 is " + (Math.sin(100)));
      System.out.println("The cosine of 100 is " + (Math.cos(100)));
      System.out.println("The floor of 44.7 is " + (Math.floor(44.7)));
      System.out.println("The ceiling of 44.7 is " + (Math.ceil(44.7)));
      System.out.println("The round of 44.7 is " + (Math.round(44.7)));
      System.out.println("The larger of the character K and the integer 70 is " + 
                        (Math.max(blah,70)));
      System.out.println("The smaller of the character K and the integer 70 is " + 
                        (Math.min(blah,70)));

   } // method main

} // class MathJunk
