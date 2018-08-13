// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// ReadKBWriteFile.java
// Chapter 13A Page 594
// Known Bugs : None

// Reads from the keyboard and writes to a data file.

import java.io.*;

public class ReadKBWriteFile

{

   public static void main (String[] args) throws IOException

   {

      InputStream istream;
      OutputStream ostream;
      File outFile = new File ("datafile.dat");
      int c;

      istream = System.in;
      ostream = new FileOutputStream(outFile);

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

} // class ReadKBWriteFile

// Output :

/*

C:\Program Files\jdk1.2\bin>java ReadKBWriteFile
Testing... 1, 2, 3... Testing...

C:\Program Files\jdk1.2\bin>
*/
