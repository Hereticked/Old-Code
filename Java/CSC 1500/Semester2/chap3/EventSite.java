// James Poulette   CSC 1550 03   99 - 02 - 07

// EventSite.java   Page 103   Grey Box #9

// Chapter 3 version of EventSite.java.

public class EventSite {

   static final public String HEADQUARTERS = "Crystal Lake, IL";

   private int siteNumber;
   private double usageFee;
   private String managerName;

   EventSite() {

      siteNumber = 999;
      managerName = "ZZZ";

   }

   EventSite(int siteNum) {

      siteNumber = siteNum;
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
