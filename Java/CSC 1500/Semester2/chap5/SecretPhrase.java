// James Poulette
// CSC 1550 03
// 99 - 03 - 07
// SecretPhrase.java   pages 235 - 236
// Known Bugs : None

// A stupid little game.

public class SecretPhrase

{

   public static void main(String[]args) throws Exception

   {

      String targetPhrase = "Plan With Us";
      String displayPhrase = "P*** W*** U*";

      char guess;
      int position;

      System.out.println("Play our game - guess our motto");
      System.out.println(displayPhrase);

      while(displayPhrase.indexOf('*') != -1)

      {

         System.out.println("Enter a letter");
         guess = (char)System.in.read();

         System.in.read();
         System.in.read();

         position = targetPhrase.indexOf(guess);

         if(position == -1)

            System.out.println("Sorry - guess again");

         else

         {

            displayPhrase = displayPhrase.substring(0,position) + guess + 
               displayPhrase.substring(position + 1,displayPhrase.length());

            System.out.println(displayPhrase);

         }

      }

      System.out.println("Congratulations!");

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java SecretPhrase
Play our game - guess our motto
P*** W*** U*
Enter a letter
l
Pl** W*** U*
Enter a letter
a
Pla* W*** U*
Enter a letter
n
Plan W*** U*
Enter a letter
i
Plan Wi** U*
Enter a letter
t
Plan Wit* U*
Enter a letter
h
Plan With U*
Enter a letter
s
Plan With Us
Congratulations!

C:\Program Files\JDK\bin>

*/
