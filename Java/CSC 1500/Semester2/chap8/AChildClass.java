// James Poulette
// CSC 1550 03
// 99 - 04 - 11
// AChildClass.java
// Chapter 8B Page 392
// Known Bugs : None

// Child class inherits from the parent class.

public class AChildClass extends AParentClass

{

   // This method has the same name as the parent's method, but the child can call
   // the parent method without conflict by using the keyword "super".

   public void printClassName()

   {

      System.out.println("I am AChildClass");
      System.out.println("My parent is ");

      super.printClassName();

   } // method printClassName

} // class AChildClass
