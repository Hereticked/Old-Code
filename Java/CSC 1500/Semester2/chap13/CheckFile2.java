// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// CheckFile2.java
// Chapter 13A Page 586
// Known Bugs : None

// Checks for a nonexistent file.

import java.io.*;

public class CheckFile2

{

   public static void main (String[] args)

   {

      File f = new File ("nodata.txt");

      if (f.exists())

      {

         System.out.println (f.getName() + " exists");
         System.out.println ("The file is " + f.length() + " bytes long");

         if (f.canRead())

            System.out.println (" OK to read");

         if (f.canWrite())

            System.out.println (" OK to write");

      }

      else

      {

         System.out.println ("File does not exist");

      }

   } // method main

} // class CheckFile2

// Output :

/*

C:\Program Files\jdk1.2\bin>java CheckFile2
File does not exist

C:\Program Files\jdk1.2\bin>

*/
