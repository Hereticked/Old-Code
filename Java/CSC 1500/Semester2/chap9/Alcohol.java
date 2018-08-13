// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// Alcohol.java
// Chapter 9B Page 448 #3
// Known Bugs : None

// Child class of Drug class.

public class Alcohol extends Drug

{

   public Alcohol() throws Exception

   {

      super(1);

   }

   public void setPurpose()

   {

      purpose = "Kills brain cells. Destroys the liver. Renders coherent thought," +
                "\n         " +
                " speech, and motor skills useless. Useful when you don't want to" +
                "\n         " +
                " deal with your problems.";

   }

   public void setTimesPerDay()

   {

      timesPerDay = 10;

   }

   public String display()

   {

      return("Drug : " + drug +
             "\nPurpose : " + purpose +
             "\nRecommended Usage : " + timesPerDay + " times a day");

   }

} // class Alcohol
