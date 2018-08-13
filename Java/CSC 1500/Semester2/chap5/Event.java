// James Poulette
// CSC 1550 03   
// 99 - 03 - 01
// Event.java   Pages 150 - 218
// Known Bugs : None

// Support code for EventArray.java.

public class Event {

   private char eventType;
   private double eventMinRate;

   public Event(char event, double rate) {

      eventType =  event;
      eventMinRate = rate;

   }

   public char getEventType() {

      return eventType;

   }

   public double getEventMinRate() {

      return eventMinRate;

   }

   public void setEventMinRate(double rate) {

      eventMinRate = rate;

   }

}
