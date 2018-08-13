// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// CheckTwoFiles.java
// Chapter 13A Pages 586 - 587
// Known Bugs : None

// Compares two existing files.

import java.io.*;

public class CheckTwoFiles

{

   public static void main (String[] args)

   {

      File f1 = new File ("data.txt");
      File f2 = new File ("data2.txt");

      if (f1.exists() && f2.exists())

      {

         System.out.println ("The more recent file is ");

         if (f1.lastModified() > f2.lastModified())

         {

            System.out.println (f1.getName());

         }

         else

         {

            System.out.println (f2.getName());

         }

         System.out.println ("The longer file is ");

         if (f1.length() > f2.length())

         {

            System.out.println (f1.getName());

         }

         else

         {

            System.out.println (f2.getName());

         }

      }

   } // method main

} // class CheckTwoFiles

// Output :

/*

C:\Program Files\jdk1.2\bin>java CheckTwoFiles
The more recent file is
data2.txt
The longer file is
data2.txt

C:\Program Files\jdk1.2\bin>

*/
