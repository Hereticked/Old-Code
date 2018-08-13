// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// Smile.java   page 360 #1
// Known Bugs : None

// Smiley face changes whenever the button is pushed.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Smile extends Applet implements ActionListener

{

   Button pressMe = new Button("Press");

   int counter = 0;

   public void init()

   {

      add(pressMe);
      pressMe.addActionListener(this);

   }

   public void paint(Graphics gr)

   {

      if(counter % 2 != 1)

      {

         gr.setColor(Color.yellow);
         gr.fillOval(100, 100, 100, 100);
         gr.setColor(Color.black);
         gr.fillOval(125, 125, 10, 10);
         gr.fillOval(165, 125, 10, 10);
         gr.drawArc(120, 130, 60, 50, 180, 180);

      }

      else

      {

         gr.setColor(Color.yellow);
         gr.fillOval(100, 100, 100, 100);
         gr.setColor(Color.black);
         gr.fillOval(125, 125, 10, 10);
         gr.fillOval(165, 125, 10, 10);
         gr.drawArc(120, 150, 60, 50, 0, 180);

      }

   }

   public void actionPerformed(ActionEvent e)

   {

      ++counter;
      repaint();

   }

} // class Smile
