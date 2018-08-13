// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// Party.java
// Chapter 12B Page 573
// Known Bugs : None

public class Party

{

   String host = new String();
   int guests;

   public Party (String hst, int gst) throws PartyException

   {

      host = hst;
      guests = gst;

      if (gst < 10)

         throw (new PartyException(hst));

   }

} // class Party