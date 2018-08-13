// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// Ford.java
// Chapter 9A Page 429 #3
// Known Bugs : None

// Child class of Auto class.

public class Ford extends Auto

{

   public Ford() throws Exception

   {

      super(1);

   }

   public void setPrice()

   {

      price = 2800;

   }

   public String display()

   {

      return("A " + make + " is going to cost you about $" + price);

   }

} // class Ford
