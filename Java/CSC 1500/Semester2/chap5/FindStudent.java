// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// FindStudent.java   pages 256 - 257
// Known Bugs : None

// Prompts the user to enter the initial of a student then displays the student's location
// in the array.

public class FindStudent

{

   public static void main(String[]args) throws Exception

   {

      String[][] students =

      {   {"Dave", "Bonnie", "Hannah"},
          {"Iris", "Keith", "Carl"},
          {"Amy", "Jessica", "Francis"},
          {"Ellen", "George", "Lydia"}   };

      char stu;
      int r, c;

      System.out.print("Enter student initial ");

      stu = (char)System.in.read();

      for(r = 0; r < 4; ++r)

         for(c = 0; c < 3; ++c)

            if(stu == students[r][c].charAt(0))

               System.out.println("Student is in row " + r + " and column " + c);

   }

}

// Output :

/*

C:\Program Files\JDK\bin>java FindStudent
Enter student initial A
Student is in row 2 and column 0

C:\Program Files\JDK\bin>

*/
