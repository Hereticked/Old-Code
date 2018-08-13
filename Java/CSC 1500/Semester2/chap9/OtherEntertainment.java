// James Poulette
// CSC 1550 03
// 99 - 04 - 18
// OtherEntertainment.java
// Chapter 9A & 9B Pages 418 - 443
// Known Bugs : None

// Another child class of Entertainment class.

package com.eventhandlers.entertainment;

public class OtherEntertainment extends Entertainment

{

   private String typeOfAct;

   public OtherEntertainment() throws Exception

   {

      super();
      setTypeOfAct();

   }

   public void setTypeOfAct() throws Exception

   {

      String inputString = new String();
      char newChar;

      System.out.print("What type of act is this? ");

      newChar = (char)System.in.read();

      while(newChar >= 'A' && newChar <= 'z' || newChar == ' ')

      {

         inputString = inputString + newChar;
         newChar = (char)System.in.read();

      }

      System.in.read();

      typeOfAct = inputString;

   }

   public void setEntertainmentFee()

   {

      fee = 50;

   }

   public String toString()

   {

      return(entertainer + ", a " + typeOfAct + ". Fee is $" + fee +
         " per hour.");

   }

} // class OtherEntertainment
