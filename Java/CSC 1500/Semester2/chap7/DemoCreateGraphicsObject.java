// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// DemoCreateGraphicsObject.java   pages 324 - 326
// Known Bugs : None

// Displays graphics once the button has been pushed several times and the 
// string reachs the bottom right hand corner of the applet.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoCreateGraphicsObject extends Applet implements ActionListener

{

   String companyName = new String("Event Handlers Incorporated");

   Button moveButton = new Button("Move It");

   Font hel12Font = new Font("Helvetica", Font.ITALIC, 12);

   int x = 10, y = 50;

   public void init()

   {

      setBackground(Color.yellow);
      add (moveButton);
      moveButton.addActionListener(this);

   }

   public void actionPerformed(ActionEvent e)

   {

      Graphics gr = getGraphics();
      gr.setFont(hel12Font);
      gr.setColor(Color.magenta);

      if(x < 250)

      {

         gr.drawString(companyName,x+=20,y+=20);

      }

      else

      {

         moveButton.setEnabled(false);
         gr.setColor(Color.black);
         gr.drawOval(50,170,70,70);
         gr.drawLine(85,240,110,300);
         gr.drawOval(100,170,70,70);
         gr.drawLine(135,240,110,300);

      }

   }

} // class DemoCreateGraphicsObject
