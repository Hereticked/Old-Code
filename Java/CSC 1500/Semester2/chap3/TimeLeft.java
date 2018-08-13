// James Poulette   CSC 1550 03   99 - 02 - 07

// TimeLeft.java   Page 131   #5

// Doomsday countdown...

import java.util.*;

class TimeLeft {

   public static void main (String[] args) {

      Date today = new Date();
      long time1 = (today.getTime());

      Date doomsday = new Date(100,0,1);
      long time2 = (doomsday.getTime());

      long daysleft = time2 - time1;
      daysleft = ((((daysleft / 1000) / 60) / 60) / 24);

      System.out.println();
      System.out.println("There are only " + daysleft + " days left before Y2K destroys modern civilization.");

   } // method main

} // class TimeLeft
