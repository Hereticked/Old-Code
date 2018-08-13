// James Poulette   CSC 1550 03   99 - 02 - 07

// TestCircle.java   Page 87   #3

// Uses Circle.java to compute the diameter and area of 3 circles.

public class TestCircle {

   public static void main(String[] args) {

      Circle circ1 = new Circle();
      Circle circ2 = new Circle();
      Circle circ3 = new Circle();

      circ1.setRadius(5);
      circ2.setRadius(30);

      System.out.println();
      System.out.println("The diameter of circle 1 is " + 
                         circ1.computeDiameter(circ1.getRadius()));
      System.out.println("The diameter of circle 2 is " + 
                         circ2.computeDiameter(circ2.getRadius()));
      System.out.println("The diameter of circle 3 is " + 
                         circ3.computeDiameter(circ3.getRadius()));
      System.out.println();
      System.out.println("The area of circle 1 is " + 
                         circ1.computeArea(circ1.getRadius()));
      System.out.println("The area of circle 2 is " + 
                         circ2.computeArea(circ2.getRadius()));
      System.out.println("The area of circle 3 is " + 
                         circ3.computeArea(circ3.getRadius()));

   } // method main

} // class TestCircle
