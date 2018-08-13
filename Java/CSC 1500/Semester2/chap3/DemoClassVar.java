// James Poulette   CSC 1550 03   99 - 02 - 07

// DemoClassVar.java   Page 118   Grey Box #11

// Yet another test for EventSite.java.

class DemoClassVar {

   public static void main (String[] args) {

      EventSite oneSite = new EventSite();
      EventSite anotherSite = new EventSite();

      oneSite.setSiteNumber(101);
      anotherSite.setSiteNumber(202);

      System.out.print("The number of one site is ");
      System.out.println(oneSite.getSiteNumber());
      System.out.print("Headquarters located at ");
      System.out.println(oneSite.HEADQUARTERS);
      System.out.print("The number of another site is ");
      System.out.println(anotherSite.getSiteNumber());
      System.out.print("Headquarters located at ");
      System.out.println(anotherSite.HEADQUARTERS);      

   } // method main

} // class DemoClassVar
