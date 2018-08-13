// James Poulette   CSC 1550 03   99 - 02 - 07

// DemoDate.java   Page 125   Grey Box #13

// Messes around with the Date class.

import java.util.*;

public class DemoDate {

   public static void main (String[] args) {

      Date startTime = new Date(99,1,7);
      Date classStart = new Date(99,0,21);

      System.out.println("The current date is " + startTime);
      System.out.println("The class started on " + classStart);

      Date endTime = new Date();

      System.out.print("Time elapsed is ");
      System.out.print(endTime.getTime() - startTime.getTime());
      System.out.println(" milliseconds");    

   } // method main

} // class DemoDate
