// James Poulette
// CSC 1550 03
// 99 - 04 - 19
// DrugUse.java
// Chapter 9B Page 448 #3
// Known Bugs : None

// Uses a parent class and two child classes to display info on drugs. The user has a choice
// of two drugs and the program responds by displaying the purpose and recommended usage of the
// the drug.

public class DrugUse

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

         System.out.println("What drug would you like information on?");
         System.out.println("(1)   Alcohol");
         System.out.println("(2)   Tobacco");

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

         Alcohol drug1 = new Alcohol();

         System.out.println(drug1.display());

      }

      else

      {

         Tobacco drug2 = new Tobacco();

         System.out.println(drug2.display());

      }

   } // method main

} // class DrugUse

// Output :

/*

C:\Program Files\jdk1.2\bin>java DrugUse
What drug would you like information on?
(1)   Alcohol
(2)   Tobacco
5
That is not a valid selection.
What drug would you like information on?
(1)   Alcohol
(2)   Tobacco
1
Drug : Alcohol
Purpose : Kills brain cells. Destroys the liver. Renders coherent thought,
          speech, and motor skills useless. Useful when you don't want to
          deal with your problems.
Recommended Usage : 10 times a day

C:\Program Files\jdk1.2\bin>

C:\Program Files\jdk1.2\bin>java DrugUse
What drug would you like information on?
(1)   Alcohol
(2)   Tobacco
0
That is not a valid selection.
What drug would you like information on?
(1)   Alcohol
(2)   Tobacco
2
Drug : Tobacco
Purpose : Kills brain cells. Destroys the lungs. Soothes the nerves.
          Causes cancer. Very addictive drug that gives people a
          "pick me up" when needed and allows them to stay focused
          and think clearly when normally they would be unable to.
Recommended Usage : 20 times a day

C:\Program Files\jdk1.2\bin>

*/
