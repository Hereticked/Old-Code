// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 04 - 11
// UseBooks.java
// Chapter 8 Page 383 #3
// Known Bugs : None

// Uses objects of the Book and Textbook classes to display the page number, display the title,
// and allow the user to input a grade level.

public class UseBooks

{

   public static void main (String[] args) throws Exception

   {

      Book aBook = new Book();
      Textbook aText = new Textbook();

      aBook.setPageNum();
      aBook.getPageNum();
      aBook.setTitle();
      aBook.getTitle();
      aText.setGradeLevel();
      aText.getGradeLevel();

   } // method main

} // class UseBooks

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseBooks
The page number is : 10
The title is : Event Horizon
Please enter a grade level (1 - 9) : a
Please enter a grade level (1 - 9) : G
Please enter a grade level (1 - 9) : %
Please enter a grade level (1 - 9) : 7
The grade level is : 7

C:\Program Files\jdk1.2\bin>

*/
