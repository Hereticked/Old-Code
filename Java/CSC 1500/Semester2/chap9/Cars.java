// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// Cars.java
// Chapter 9A Page 429 #3
// Known Bugs : None

// Uses a parent class and two child classes to display info on cars. The user has a choice
// of two cars and the program responds by displaying the price of that kind of car.

public class Cars

{

   public static void main(String[] args) throws Exception

   {

      char inChar;
      boolean checker = false;

      do {

         if (checker == true)

         {

            System.out.println("That is not a valid selection.");

         }

         System.out.println("What kind of a car would you like?");
         System.out.println("(1)   Ford");
         System.out.println("(2)   Chevy");

         inChar = (char)System.in.read();

         System.in.read();
         System.in.read();

         if (inChar != '1' && inChar != '2')

         {

            checker = true;

         }

      } while (inChar < '1' || inChar > '2');

      if (inChar == '1')

      {

         Ford car1 = new Ford();

         System.out.println(car1.display());

      }

      else

      {

         Chevy car2 = new Chevy();

         System.out.println(car2.display());

      }

   } // method main

} // class Cars

// Output :

/*

C:\Program Files\jdk1.2\bin>java Cars
What kind of a car would you like?
(1)   Ford
(2)   Chevy
4
That is not a valid selection.
What kind of a car would you like?
(1)   Ford
(2)   Chevy
1
A Ford is going to cost you about $2800

C:\Program Files\jdk1.2\bin>

C:\Program Files\jdk1.2\bin>java Cars
What kind of a car would you like?
(1)   Ford
(2)   Chevy
0
That is not a valid selection.
What kind of a car would you like?
(1)   Ford
(2)   Chevy
2
A Chevy is going to cost you about $3500

C:\Program Files\jdk1.2\bin>

*/
