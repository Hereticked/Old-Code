// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// Rate.java   page 264   #6
// Known Bugs : None

// Stores data in a two-dimensional array, displays the people that make more than $15 an hour.

public class Rate

{

   public static void main(String[]args)

   {

      String[][] people = {   {"Ollie Regan", "manager"},
			      {"William Sherman", "assistant manager"},
			      {"Maureen Mooney", "produce manager"},
			      {"Marty Sharik", "bakery manager"},
			      {"Marcella Riley", "cashier manager"}   };

      double[] rates = {18, 16, 15, 15.25, 13};

      int x;

      for(x = 0; x < rates.length; ++x)

      {

         if(rates[x] > 15)

            System.out.println(people[x][0] + ", the " + people[x][1] + 
               ", earns more than $15 an hour.");

      }

   }

}
      
// Output :

/*

C:\Program Files\JDK\bin>java Rate
Ollie Regan, the manager, earns more than $15 an hour.
William Sherman, the assistant manager, earns more than $15 an hour.
Marty Sharik, the bakery manager, earns more than $15 an hour.

C:\Program Files\JDK\bin>

*/
