// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// AccessRandomly.java
// Chapter 13B Pages 613 - 614
// Known Bugs : None

// Creating a random access file.

import java.io.*;

public class AccessRandomly

{

   public static void main (String[] args) throws IOException

   {

      OutputStream ostream;
      int c;
      RandomAccessFile inFile = new RandomAccessFile ("datafile.dat", "r");

      ostream = System.out;

      try

      {

         inFile.seek(6);
         c = inFile.read();
         ostream.write(c);

      }

      catch (IOException e)

      {

         System.out.println ("Error : " + e.getMessage());

      }

      finally

      {

         inFile.close();
         ostream.close();

      }

   } // method main

} // class AccessRandomly

// Output :

/*

C:\Program Files\jdk1.2\bin>java ReadKBWriteFile
This is my random access file!

C:\Program Files\jdk1.2\bin>java AccessRandomly
s
C:\Program Files\jdk1.2\bin>

*/
