// James Poulette
// CSC 1550 03   
// 99 - 02 - 08
// Event.java   Pages 150 - 218
// Known Bugs : None

// Support code for ChooseManager.java.

public class Event {

   private char eventType;
   private double eventMinRate;

   public Event(char event, double rate) {

      eventType =  event;
      eventMinRate = rate;

   } // method Event

   public char getEventType() {

      return eventType;

   } // method getEventType

   public double getEventMinRate() {

      return eventMinRate;

   } // method getEventMinRate

} // class Event
