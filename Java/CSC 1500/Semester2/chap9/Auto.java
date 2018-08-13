// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// Auto.java
// Chapter 9A Page 429 #3
// Known Bugs : None

// Parent class.

public abstract class Auto

{

   protected String make;
   protected int price;

   public Auto(int num) throws Exception

   {

      setMake(num);
      setPrice();

   }

   public String getMake()

   {

      return make;

   }

   public double getPrice()

   {

      return price;

   }

   public void setMake(int modelNum)

   {

      if (modelNum == 1)

      {

         make = "Ford";

      }

      else

      {

         make = "Chevy";

      }

   }

   public abstract void setPrice();

} // class Auto
