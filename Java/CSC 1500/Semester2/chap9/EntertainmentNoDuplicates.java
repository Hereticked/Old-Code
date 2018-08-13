// James Poulette
// CSC 1550 03
// 99 - 04 - 18
// EntertainmentNoDuplicates.java
// Chapter 9B Pages 435 - 436
// Known Bugs : None

// Entertainment objects with the same entertainer.

public class EntertainmentNoDuplicates

{

   public static void main(String[] args) throws Exception

   {

      Entertainment[] actArray = new Entertainment[6];

      int x;

      for (x = 0; x < actArray.length; ++x)

      {

         char selection;

         System.out.println("Please select the type of act you want to enter :");
         System.out.println("   1 - Musical act");
         System.out.println("   2 - Any other type of act");

         selection = (char)System.in.read();

         System.in.read();
         System.in.read();

         if (selection == '1')

         {

            actArray[x] = new MusicalEntertainment();

         }

         else

         {

            actArray[x] = new OtherEntertainment();

         }

         for (int y = 0; y < x; ++y)

         {

            if (actArray[x].equals(actArray[y]))

            {

               System.out.println("Sorry, you entered a duplicate act.");

               --x;

            }

         }

      }

      System.out.println("\n\nOur available entertainment selections include :\n");

      for (x = 0; x < actArray.length; ++x)

      {

         System.out.println(actArray[x].toString());

      }

   } // method main

} // class EntertainmentNoDuplicates

// Output :

/*

C:\Program Files\jdk1.2\bin>java EntertainmentNoDuplicates
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Tool
What type of music do they play? alternative rock
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
2
Enter name of entertainer Carrot Top
What type of act is this? bad comedy
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Carrot Top
What type of music do they play? bad music
Sorry, you entered a duplicate act.
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Nirvana
What type of music do they play? alternative rock
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Gravity Kills
What type of music do they play? techno
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer The Nixons
What type of music do they play? alternative rock
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Alice In Chains
What type of music do they play? cool


Our available entertainment selections include :

Tool, featuring alternative rock music. Fee is $600 per event.
Carrot Top, a bad comedy. Fee is $50 per hour.
Nirvana, featuring alternative rock music. Fee is $600 per event.
Gravity Kills, featuring techno music. Fee is $600 per event.
The Nixons, featuring alternative rock music. Fee is $600 per event.
Alice In Chains, featuring cool music. Fee is $600 per event.

C:\Program Files\jdk1.2\bin>

*/
