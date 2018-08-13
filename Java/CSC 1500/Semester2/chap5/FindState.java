// James Poulette
// CSC 1550 03
// 99 - 03 - 07
// FindState.java   pages 231 - 233
// Known Bugs : None

// Searchs an array of strings for certain words.

public class FindState

{

   public static void main(String[]args)

   {

      String[] states = {"Alaska", "California", "Illinois", "Oregon", "Texas",
                	 "Wisconsin", "Wyoming"};

      String firstState = "Illinois";
      String secondState = "Ohio";

      int x;
      boolean found = false;

      for(x = 0; x < states.length; ++x)

         if(firstState.equals(states[x]))

            found = true;

      if(found)

         System.out.println(firstState + " is in the list");

      else

         System.out.println(firstState + " is not in the list");

      found = false;

      for(x = 0; x < states.length; ++x)

         if(secondState.equals(states[x]))

            found = true;

      if(found)

         System.out.println(secondState + " is in the list");

      else

         System.out.println(secondState + " is not in the list");

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java FindState
Illinois is in the list
Ohio is not in the list

C:\Program Files\JDK\bin>


*/
