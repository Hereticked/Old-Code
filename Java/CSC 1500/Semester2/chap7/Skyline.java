// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// Skyline.java   Page 335 #3
// Known Bugs : None

// Switches between night and day whenever the button is pushed.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Skyline extends Applet implements ActionListener

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

         setBackground(Color.cyan);
         gr.setColor(Color.black);
         gr.fillRect(0, 100, 100, 200);
         gr.fillRect(500, 125, 100, 175);
         gr.fillRect(100, 250, 400, 50);
         gr.fillRect(150, 150, 150, 100);
         gr.fillRect(350, 200, 100, 50);
         gr.setColor(Color.yellow);
         gr.fillOval(400, 25, 50, 50);

      }

      else

      {

         setBackground(Color.gray);
         gr.setColor(Color.black);
         gr.fillRect(0, 100, 100, 200);
         gr.fillRect(500, 125, 100, 175);
         gr.fillRect(100, 250, 400, 50);
         gr.fillRect(150, 150, 150, 100);
         gr.fillRect(350, 200, 100, 50);
         gr.setColor(Color.white);
         gr.fillOval(200, 25, 50, 50);

      }

   }

   public void actionPerformed(ActionEvent e)

   {

      ++counter;
      repaint();

   }

} // class Skyline
