// James Poulette
// CSC 1550 03
// 99 - 04 - 18
// MusicalEntertainment.java
// Chapter 9A & 9B Pages 416 - 443
// Known Bugs : None

// Child class of Entertainment class.

package com.eventhandlers.entertainment;

public class MusicalEntertainment extends Entertainment

{

   private String typeOfMusic;

   public MusicalEntertainment() throws Exception

   {

      super();
      setTypeOfMusic();

   }

   public void setTypeOfMusic() throws Exception

   {

      String inputString = new String();
      char newChar;

      System.out.print("What type of music do they play? ");

      newChar = (char)System.in.read();

      while(newChar >= 'A' && newChar <= 'z' || newChar == ' ')

      {

         inputString = inputString + newChar;
         newChar = (char)System.in.read();

      }

      System.in.read();

      typeOfMusic = inputString;

   }

   public void setEntertainmentFee()

   {

      fee = 600;

   }

   public String toString()

   {

      return(entertainer + ", featuring " + typeOfMusic + " music. Fee is $" + fee +
         " per event.");

   }

} // class MusicalEntertainment
