// James Poulette
// CSC 1550 03
// 99 - 02 - 08
// Admission.java   Page 157   #3
// Known Bugs : None

// Accepts or rejects your application based on what you input for your grades.

import java.io.*;

public class Admission {

   public static void main(String[] args) throws IOException {

      double gpa;
      int ats;

      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("What is your grade point average? ");

      gpa = new Double(stdin.readLine()).doubleValue();

      System.out.print("What is your admission test score? ");

      ats = Integer.parseInt(stdin.readLine());

      if((gpa >= 3.0) && (ats >= 60)) {
         System.out.println("Accept"); 
      }
      else {
         if((gpa < 3.0) && (ats >= 80)) {
            System.out.println("Accept");
         }
         else {
            System.out.println("Reject");
         }
      }

   } // method main

} // class Admission

// Output :

/* 

C:\Program Files\JDK\bin>java Admission
What is your grade point average? 2.9
What is your admission test score? 50
Reject

C:\Program Files\JDK\bin>java Admission
What is your grade point average? 3.5
What is your admission test score? 75
Accept

C:\Program Files\JDK\bin>java Admission
What is your grade point average? 2.5
What is your admission test score? 85
Accept

C:\Program Files\JDK\bin>java Admission
What is your grade point average? 2.9
What is your admission test score? 50
Reject

C:\Program Files\JDK\bin>

*/
