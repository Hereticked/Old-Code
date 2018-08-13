// James Poulette
// CSC 1550 03
// 99 - 05 - 01
// MouseFrame.java
// Chapter 11B Page 534
// Known Bugs : None

import java.awt.*;
import java.awt.event.*;

public class MouseFrame extends Frame implements MouseListener

{

   int x, y;
   int size;

   public MouseFrame()

   {

      setTitle("Mouse Frame");
      addMouseListener(this);

   }

   public void mousePressed (MouseEvent e)

   {

      x = e.getX();
      y = e.getY();
      repaint();

   }

   public void mouseClicked (MouseEvent e)

   {

      if (e.getClickCount() == 2)
         size = 10;
      else size = 4;
      repaint();

   }

   public void mouseEntered (MouseEvent e)

   {

      setBackground(Color.yellow);

   }

   public void mouseExited (MouseEvent e)

   {

      setBackground(Color.black);

   }

   public void mouseReleased (MouseEvent e)

   {

   }

   public void paint(Graphics g)

   {

      g.drawOval(x - size, y - size, size * 2, size * 2);

   }

} // class MouseFrame
