// James Poulette
// CSC 1550 03
// 99 - 04 - 18
// Entertainment.java
// Chapter 9A & 9B Pages 415 - 442
// Known Bugs : None

// Parent class.

package com.eventhandlers.entertainment;

public abstract class Entertainment

{

   protected String entertainer;
   protected int fee;

   public Entertainment() throws Exception

   {

      setEntertainerName();
      setEntertainmentFee();

   }

   public boolean equals(Entertainment act)

   {

      boolean result;

      if(entertainer.equals(act.entertainer))

      {

         result = true;

      }

      else

      {

         result = false;

      }

      return result;

   }

   public String getEntertainerName()

   {

      return entertainer;

   }

   public double getEntertainmentFee()

   {

      return fee;

   }

   public void setEntertainerName() throws Exception

   {

      String inputString = new String();
      char newChar;

      System.out.print("Enter name of entertainer ");

      newChar = (char)System.in.read();

      while(newChar >= 'A' && newChar <= 'z' || newChar == ' ')

      {

         inputString = inputString + newChar;
         newChar = (char)System.in.read();

      }

      System.in.read();

      entertainer = inputString;

   }

   public abstract void setEntertainmentFee();

} // class Entertainment
