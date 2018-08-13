// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 04 - 11
// Computer.java
// Chapter 8 Page 405 #2
// Known Bugs : None

// This is the parent class.

public class Computer

{

   private int pModel;
   private int cSpeed;

   public void setModel(int modelnum)

   {

      pModel = modelnum;

   } // method setModel

   public void getModel()

   {

      System.out.println("The processor model is : " + pModel);

   } // method getModel

   public void setSpeed(int speednum)

   {

      cSpeed = speednum;

   } // method setSpeed

   public void getSpeed()

   {

      System.out.println("The clock speed is : " + cSpeed);

   } // method getSpeed

} // class Computer
