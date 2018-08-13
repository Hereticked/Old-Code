// James Poulette   CSC 1550 03   99 - 02 - 07

// DemoConstruct.java   Page 105   Grey Box #10

// Tests Chapter 3 version of EventSite.java.

public class DemoConstruct {

   public static void main (String[] args) {

      EventSite aSite = new EventSite(678);
      EventSite anotherSite = new EventSite();

      System.out.println("Site number is " + aSite.getSiteNumber());
      System.out.println("Another site number is " + anotherSite.getSiteNumber());

   } // method main

} // class DemoConstruct
