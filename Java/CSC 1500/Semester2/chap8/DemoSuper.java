// James Poulette
// CSC 1550 03
// 99 - 04 - 11
// DemoSuper.java
// Chapter 8B Page 393
// Known Bugs : None

// Shows that the child class can call its parent's method.

public class DemoSuper

{

   public static void main (String[] args)

   {

      AChildClass child = new AChildClass();

      child.printClassName();

   } // method main

} // class DemoSuper

// Output :

/*

C:\Program Files\jdk1.2\bin>java DemoSuper
I am AChildClass
My parent is
AParentClass

C:\Program Files\jdk1.2\bin>

*/
