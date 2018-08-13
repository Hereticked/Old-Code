// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// Drug.java
// Chapter 9B Page 448 #3
// Known Bugs : None

// Parent class.

public abstract class Drug

{

   protected String drug;
   protected String purpose;
   protected int timesPerDay;

   public Drug(int num) throws Exception

   {

      setDrug(num);
      setPurpose();
      setTimesPerDay();

   }

   public String getDrug()

   {

      return drug;

   }

   public String getPurpose()

   {

      return purpose;

   }

   public double getTimesPerDay()

   {

      return timesPerDay;

   }

   public void setDrug(int drugNum)

   {

      if (drugNum == 1)

      {

         drug = "Alcohol";

      }

      else

      {

         drug = "Tobacco";

      }

   }

   public abstract void setPurpose();

   public abstract void setTimesPerDay();

} // class Drug
