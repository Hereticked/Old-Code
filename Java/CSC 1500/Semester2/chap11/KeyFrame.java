// James Poulette
// CSC 1550 03
// 99 - 05 - 01
// KeyFrame.java
// Chapter 11B Page 526
// Known Bugs : None

import java.awt.*;
import java.awt.event.*;

public class KeyFrame extends Frame implements KeyListener

{

   public KeyFrame()

   {

      setTitle("Key Frame");
      addKeyListener(this);

   }

   public void keyPressed (KeyEvent e)

   {                                    

      System.out.println("pressed");

   }
  
   public void keyTyped (KeyEvent e)

   {

      System.out.println("typed");

   }

   public void keyReleased (KeyEvent e)

   {

      System.out.println("released");

   }

} // class KeyFrame
