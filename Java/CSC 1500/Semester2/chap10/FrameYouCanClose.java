// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// FrameYouCanClose.java
// Chapter 10A Page 457
// Known Bugs : None

import java.awt.event.*;
import java.awt.*;

public class FrameYouCanClose extends Frame implements WindowListener

{

   public FrameYouCanClose(String str)

   {

      super(str);
      addWindowListener(this);

   } // method FrameYouCanClose

   public void windowClosing(WindowEvent e)

   {

      System.exit(0);

   } // method windowClosing

   public void windowClosed (WindowEvent e) {}
   public void windowDeiconified (WindowEvent e) {}
   public void windowIconified (WindowEvent e) {}
   public void windowOpened (WindowEvent e) {}
   public void windowActivated (WindowEvent e) {}
   public void windowDeactivated (WindowEvent e) {}

} // class FrameYouCanClose
