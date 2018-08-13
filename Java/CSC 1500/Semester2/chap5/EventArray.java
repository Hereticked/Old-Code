// James Poulette
// CSC 1550 03
// 99 - 03 - 01
// EventArray.java   pages 205 - 229
// Known Bugs : None

// This program does a lot of nothing.

public class EventArray

{

   static final double CORP_RATE = 75.99;
   static final double PRI_RATE = 47.99;
   static final double NON_PROF_RATE = 40.99;

   public static void main(String[] args) throws Exception

   {

      String[] eventType = {"Corporate", "Private", "Non-Profit"};
      String[] managerName = {"Dustin Britt", "Carmen Lindsey", "Robin Armenetti"};

      char event = 'Z';
      double rate = 0;

      boolean codeIsValid = false;
      int i;

      char[] eventCode = {'C', 'P', 'N'};
      double[] eventRate = {CORP_RATE, PRI_RATE, NON_PROF_RATE};

      Event[] someEvents = new Event[5];
      int x;

      for(x = 0; x < (someEvents.length); ++x)

         {

         System.out.println("Enter event type");
         System.out.println("C for corporate");
         System.out.println("P for private");
         System.out.println("N for non-profit");

         event = (char)System.in.read();

         System.in.read();
         System.in.read();

         for(i = 0; i < (eventCode.length); ++i)

         {

         codeIsValid = false;

            if(event == eventCode[i])

            {

               rate = eventRate[i];
               codeIsValid = true;
               System.out.println("The manager for " + eventType[i] + " events is " +
                  managerName[i]);
               i = 3;

            }

         }

         if(codeIsValid)

            someEvents[x] = new Event(event, rate);

         else

            --x;

         }

      for(x = 0; x < (someEvents.length); ++x)

         System.out.println("Event " + (x + 1) + " " + someEvents[x].getEventType() + " " + 
            someEvents[x].getEventMinRate());

      // raiseRates(someEvents);

      // for(x = 0; x < (someEvents.length); ++x)

         // System.out.println("Event " + (x + 1) + " " + someEvents[x].getEventType() + " " + 
            // someEvents[x].getEventMinRate());

   }

   private static void raiseRates(Event[] evnt)

   {

      double temp;

      for(int q = 0; q < (evnt.length); ++q)

      {

         temp = evnt[q].getEventMinRate();
         temp += 5;
         evnt[q].setEventMinRate(temp);

      }

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java EventArray
Enter event type
C for corporate
P for private
N for non-profit
C
The manager for Corporate events is Dustin Britt
Enter event type
C for corporate
P for private
N for non-profit
P
The manager for Private events is Carmen Lindsey
Enter event type
C for corporate
P for private
N for non-profit
N
The manager for Non-Profit events is Robin Armenetti
Enter event type
C for corporate
P for private
N for non-profit
P
The manager for Private events is Carmen Lindsey
Enter event type
C for corporate
P for private
N for non-profit
N
The manager for Non-Profit events is Robin Armenetti
Event 1 C 75.99
Event 2 P 47.99
Event 3 N 40.99
Event 4 P 47.99
Event 5 N 40.99

C:\Program Files\JDK\bin>

*/
