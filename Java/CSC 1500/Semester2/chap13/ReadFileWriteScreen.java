// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// ReadFileWriteScreen.java
// Chapter 13A Page 595
// Known Bugs : None

// Reads from a file and writes to the screen.

import java.io.*;

public class ReadFileWriteScreen

{

   public static void main (String[] args) throws IOException

   {

      InputStream istream;
      OutputStream ostream;
      File inFile = new File ("datafile.dat");
      int c;

      istream = new FileInputStream (inFile);
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

} // class ReadFileWriteScreen

// Output :

/*

C:\Program Files\jdk1.2\bin>java ReadFileWriteScreen
Testing... 1, 2, 3... Testing...

C:\Program Files\jdk1.2\bin>
*/
