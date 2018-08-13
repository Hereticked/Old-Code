// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// Tobacco.java
// Chapter 9B Page 448 #3
// Known Bugs : None

// Child class of Drug class.

public class Tobacco extends Drug

{

   public Tobacco() throws Exception

   {

      super(2);

   }

   public void setPurpose()

   {

      purpose = "Kills brain cells. Destroys the lungs. Soothes the nerves." +
                "\n         " +
                " Causes cancer. Very addictive drug that gives people a" +
                "\n         " +
                " \"pick me up\" when needed and allows them to stay focused" +
                "\n         " +
                " and think clearly when normally they would be unable to.";

   }

   public void setTimesPerDay()

   {

      timesPerDay = 20;

   }

   public String display()

   {

      return("Drug : " + drug +
             "\nPurpose : " + purpose +
             "\nRecommended Usage : " + timesPerDay + " times a day");

   }

} // class Tobacco
