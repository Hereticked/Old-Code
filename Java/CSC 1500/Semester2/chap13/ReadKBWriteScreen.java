// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// ReadKBWriteScreen.java
// Chapter 13A Pages 591 - 593
// Known Bugs : None

// Reads from the keyboard and writes to the screen.

import java.io.*;
public class ReadKBWriteScreen

{

   public static void main (String[] args) throws IOException

   {

      InputStream istream;
      OutputStream ostream;
      int c;

      istream = System.in;
      ostream = System.out;

      try

      {

         while ((c = istream.read()) != -1)

         {

            ostream.write(c);

         }

      }

      catch (IOException e)

      {

         System.out.println ("Error : " + e.getMessage());

      }

      finally

      {

         istream.close();
         ostream.close();

      }

   } // method main

} // class ReadKBWriteScreen

// Output :

/*
C:\Program Files\jdk1.2\bin>java ReadKBWriteScreen
This is
This is
pretty cool
pretty cool

C:\Program Files\jdk1.2\bin>
*/
