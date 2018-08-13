// James Poulette   CSC 1550 03   99 - 02 - 07

// EventSite.java   Page 68   Grey Box #4

// Support code for SetUpSite.java, TestExpandedClass.java, and TestConstructor.java.

public class EventSite {

   private int siteNumber;
   private double usageFee;
   private String managerName;

   EventSite() {

      siteNumber = 999;
      managerName = "ZZZ";

   }

   public String getManagerName() {

      return managerName;

   }

   public int getSiteNumber() {

      return siteNumber;

   } // method getSiteNumber

   public void setUsageFee(double amt) {

      usageFee = amt;

   }

   public double getUsageFee() {

      return usageFee;

   }

   public void setManagerName(String name) {

      managerName = name;

   }

   public void setSiteNumber(int n) {

      siteNumber = n;

   } // method setSiteNumber

} // class EventSite
