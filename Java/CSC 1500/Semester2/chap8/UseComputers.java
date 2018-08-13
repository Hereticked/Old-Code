// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 04 - 11
// UseComputers.java
// Chapter 8 Page 405 #2
// Known Bugs : None

// Sets and displays the processor model and clock speed using the Computer (parent) class, then 
// resets the processor model, resets the clock speed, sets the cdrom speed, and displays all 
// three using the MultimediaComputer (child) class.

public class UseComputers

{

   public static void main (String[] args) throws Exception

   {

      Computer aComp = new Computer();
      MultimediaComputer aMult = new MultimediaComputer();

      aComp.setModel(686);
      aComp.getModel();
      aComp.setSpeed(200);
      aComp.getSpeed();
      aMult.setCd(12, 486, 66);
      aMult.getCd();

   } // method main

} // class UseComputers

// Output :

/*

C:\Program Files\jdk1.2\bin>java UseComputers
The processor model is : 686
The clock speed is : 200
The processor model is : 486
The clock speed is : 66
The cdrom speed is : 12

C:\Program Files\jdk1.2\bin>

*/
