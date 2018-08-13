// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// FrameWithFixedSize.java
// Chapter 10A Page 463
// Known Bugs : None

import java.awt.event.*;
import java.awt.*;

public class FrameWithFixedSize extends Frame implements WindowListener

{

   public FrameWithFixedSize()

   {

      super("Size Can Change");
      addWindowListener(this);

   } // method FrameWithFixedSize

   public void windowClosing (WindowEvent e)

   {

      System.exit(0);

   } // method windowClosing

   public void windowIconified (WindowEvent e)

   {

      setTitle("Size Can't Change");
      setResizable(false);

   } // method windowIconified

   public void windowClosed (WindowEvent e) {}
   public void windowDeiconified (WindowEvent e) {}
   public void windowOpened (WindowEvent e) {}
   public void windowActivated (WindowEvent e) {}
   public void windowDeactivated (WindowEvent e) {}

} // class FrameWithFixedSize
