// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 04 - 11
// Book.java
// Chapter 8 Page 383 #3
// Known Bugs : None

// This is the parent class.

public class Book

{

   private String title;
   private int pageNum;

   public void setPageNum()

   {

      pageNum = 10;

   } // method setPageNum

   public void getPageNum()

   {

      System.out.println("The page number is : " + pageNum);

   } // method getPageNum

   public void setTitle()

   {

      title = "Event Horizon";

   } // method setTitle

   public void getTitle()

   {

      System.out.println("The title is : " + title);

   } // method getTitle

} // class Book
