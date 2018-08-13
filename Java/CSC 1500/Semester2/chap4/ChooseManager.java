// James Poulette
// CSC 1550 03   
// 99 - 02 - 08
// ChooseManager.java   Pages 147 - 181
// Known Bugs : None

// Demonstrates the use of an if-else structure.

public class ChooseManager {

   static final double CORP_RATE = 75.99;
   static final double PRI_RATE = 47.99;
   static final double NON_PROF_RATE = 40.99;

   public static void main(String[] args) throws Exception {

      char eventType;

      Event anEvent;

      System.out.println("Enter type of event you are scheduling");
      System.out.println("C for a corporate event");
      System.out.println("P for a private event");
      System.out.println("N for a non-profit event");

      eventType = (char)System.in.read();

      while(eventType != 'C' && eventType != 'P' && eventType != 'N' && eventType != 'c' && eventType != 'p' && eventType != 'n') {

         System.in.read();
         System.in.read();

         System.out.println("Entry must be C or P or N!");

         eventType = (char)System.in.read();

      }

      System.out.print("The manager for this event will be ");

      switch (eventType) {

         case ('C') :
            System.out.println("Dustin Britt");
	    anEvent = new Event(eventType, CORP_RATE);
	    break;
	 case ('c') :
            System.out.println("Dustin Britt");
	    anEvent = new Event(eventType, CORP_RATE);
	    break;
         case ('P') :
            System.out.println("Carmen Lindsey");
	    anEvent = new Event(eventType, PRI_RATE);
	    break;
         case ('p') :
            System.out.println("Carmen Lindsey");
	    anEvent = new Event(eventType, PRI_RATE);
	    break;
         default :
            System.out.println("Robin Armanetti");
	    anEvent = new Event(eventType, NON_PROF_RATE);

      } // end switch

      System.out.println("Event type is " + anEvent.getEventType());
      System.out.println("Minimum rate charged is $" + anEvent.getEventMinRate());

   } // method main

} // class ChooseManager

// Output :

/* 

C:\Program Files\JDK\bin>java ChooseManager
Enter type of event you are scheduling
C for a corporate event
P for a private event
N for a non-profit event
C
The manager for this event will be Dustin Britt
Event type is C
Minimum rate charged is $75.99

C:\Program Files\JDK\bin>java ChooseManager
Enter type of event you are scheduling
C for a corporate event
P for a private event
N for a non-profit event
p
The manager for this event will be Carmen Lindsey
Event type is p
Minimum rate charged is $47.99

C:\Program Files\JDK\bin>java ChooseManager
Enter type of event you are scheduling
C for a corporate event
P for a private event
N for a non-profit event
J
Entry must be C or P or N!
N
The manager for this event will be Robin Armanetti
Event type is N
Minimum rate charged is $40.99

*/
