// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// DemoPaint.java   pages 316 - 317
// Known Bugs : None

// Demonstrates how the paint method works.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoPaint extends Applet implements ActionListener

{

   Button pressButton = new Button("Press");

   public void init()

   {

      add(pressButton);
      pressButton.addActionListener(this);

   }

   public void paint(Graphics g)

   {

      System.out.println("in paint method");

   }

   public void actionPerformed(ActionEvent e)

   {

      repaint();

   }

} // class DemoPaint
