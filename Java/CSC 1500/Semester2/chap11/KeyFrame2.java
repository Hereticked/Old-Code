// James Poulette
// CSC 1550 03
// 99 - 05 - 01
// KeyFrame2.java
// Chapter 11B Page 530
// Known Bugs : None

import java.awt.*;
import java.awt.event.*;

public class KeyFrame2 extends Frame implements KeyListener

{

   char key;

   public KeyFrame2()

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
      key = (char)e.getKeyChar();
      System.out.println("Key is " + key);
      System.out.println("Next key is " + (char)(key + 1));

   }

} // class KeyFrame2
