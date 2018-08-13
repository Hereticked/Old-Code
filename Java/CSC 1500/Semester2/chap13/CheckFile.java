// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// CheckFile.java
// Chapter 13A Pages 584 - 585
// Known Bugs : None

// Uses a file object.

import java.io.*;

public class CheckFile

{

   public static void main (String[] args)

   {

      File f = new File ("data.txt");

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

} // class CheckFile

// Output :

/*

C:\Program Files\jdk1.2\bin>java CheckFile
data.txt exists
The file is 24 bytes long
 OK to read
 OK to write

C:\Program Files\jdk1.2\bin>

*/
