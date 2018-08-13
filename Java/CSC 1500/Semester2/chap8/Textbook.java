// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 04 - 11
// Textbook.java
// Chapter 8 Page 383 #3
// Known Bugs : None

// This is the child class.

public class Textbook extends Book

{

   private char gradeLevel;

   public void setGradeLevel() throws Exception

   {

      char inChar;

      do {

         System.out.print("Please enter a grade level (1 - 9) : ");

         inChar = (char)System.in.read();

         System.in.read();
         System.in.read();

         gradeLevel = inChar;

         } while (gradeLevel <= '0' || gradeLevel >= '9');

   } // method setGradeLevel

   public void getGradeLevel()

   {

      System.out.println("The grade level is : " + gradeLevel);

   } // method getGradeLevel

} // class Textbook
