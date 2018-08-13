// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// Chevy.java
// Chapter 9A Page 429 #3
// Known Bugs : None

// Child class of Auto class.

public class Chevy extends Auto

{

   public Chevy() throws Exception

   {

      super(2);

   }

   public void setPrice()

   {

      price = 3500;

   }

   public String display()

   {

      return("A " + make + " is going to cost you about $" + price);

   }

} // class Chevy
