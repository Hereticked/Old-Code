// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 04 - 11
// MultimediaComputer.java
// Chapter 8 Page 405 #2
// Known Bugs : None

// This is the child class.

public class MultimediaComputer extends Computer

{

   private int cdRom;

   public void setCd(int cdromnum, int modelnum, int speednum)

   {

      cdRom = cdromnum;

      super.setModel(modelnum);
      super.setSpeed(speednum);
      super.getModel();
      super.getSpeed();

   } // method setCd

   public void getCd()

   {

      System.out.println("The cdrom speed is : " + cdRom);

   } // method getCd

} // class MultimediaComputer
