// James Poulette   CSC 1550 03   99 - 02 - 07

// TestExpandedClass.java   Page 79   Grey Box #5

// Tests the expanded EventSite class.

public class TestExpandedClass {

   public static void main(String[] args) {

      EventSite oneSite = new EventSite();

      oneSite.setSiteNumber(101);

      oneSite.setUsageFee(32508.65);

      oneSite.setManagerName("Jefferson");

      System.out.print("The number of the event site is ");

      System.out.println(oneSite.getSiteNumber());

      System.out.println("Usage fee " + oneSite.getUsageFee());

      System.out.println("Manager is " + oneSite.getManagerName());

   } // method main

} // class TestExpandedClass
