// James Poulette   CSC 1550 03   99 - 02 - 07

// Circle.java   Page 87   #3

// Support code for TestCircle.java.

public class Circle {

   private double radius;
   private double area;
   private double diameter;

   Circle() {

      radius = 1;

   }

   public void setRadius(double a) {

      radius = a;

   } // method setRadius

   public double getRadius() {

      return radius;

   } // method getRadius

   public double computeDiameter(double b) {

      double diam;

      diam = b * 2;

      return diam;

   } // method computeDiameter

   public double computeArea(double c) {

      double ar;

      ar = (c * c) * 3.14;

      return ar;

   } // method computeArea

} // class Circle
