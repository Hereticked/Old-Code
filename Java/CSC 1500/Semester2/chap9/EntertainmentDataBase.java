// James Poulette
// CSC 1550 03
// 99 - 04 - 18
// EntertainmentDataBase.java
// Chapter 9A & 9B Pages 424 - 443
// Known Bugs : None

// Uses an Entertainment array.

// With a little tinkering around, I got this to work with version 1.2 of the JDK...
// What can I say, I'm the man...

import com.eventhandlers.entertainment.Entertainment;
import com.eventhandlers.entertainment.MusicalEntertainment;
import com.eventhandlers.entertainment.OtherEntertainment;

public class EntertainmentDataBase

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

      }

      System.out.println("\n\nOur available entertainment selections include :\n");

      for (x = 0; x < actArray.length; ++x)

      {

         System.out.println(actArray[x].toString());

      }

   } // method main

} // class EntertainmentDataBase

// Output :

/*

C:\Program Files\jdk1.2\bin>java EntertainmentDataBase
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Everlast
What type of music do they play? alternative
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Stone Temple Pilots
What type of music do they play? hard rock
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
2
Enter name of entertainer Jay Leno
What type of act is this? dorky act
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
2
Enter name of entertainer Conan Obrien
What type of act is this? cool act
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Pearl Jam
What type of music do they play? alternative rock
Please select the type of act you want to enter :
   1 - Musical act
   2 - Any other type of act
1
Enter name of entertainer Faith No More
What type of music do they play? rock


Our available entertainment selections include :

Everlast, featuring alternative music. Fee is $600 per event.
Stone Temple Pilots, featuring hard rock music. Fee is $600 per event.
Jay Leno, a dorky act. Fee is $50 per hour.
Conan Obrien, a cool act. Fee is $50 per hour.
Pearl Jam, featuring alternative rock music. Fee is $600 per event.
Faith No More, featuring rock music. Fee is $600 per event.

C:\Program Files\jdk1.2\bin>

*/
