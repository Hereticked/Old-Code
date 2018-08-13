// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// ThrowParty.java
// Chapter 12B Page 574
// Known Bugs : None

// Creates unique exceptions and throws one of them.

public class ThrowParty

{

   public static void main (String[] args)

   {

      try

      {

         Party first = new Party ("Jones", 15);
         Party second = new Party ("Lewis", 5);
         Party third = new Party ("Newman", 10);

      }

      catch (PartyException error)

      {

         System.out.println ("Party Error " + error.getMessage());

      }

   } // method main

} // class ThrowParty

// Output :

/*

C:\Program Files\jdk1.2\bin>java ThrowParty
Party Error Lewis

C:\Program Files\jdk1.2\bin>

*/