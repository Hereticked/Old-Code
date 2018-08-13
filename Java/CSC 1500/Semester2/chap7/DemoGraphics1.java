// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// DemoGraphics1.java   pages 319 - 321
// Known Bugs : None

// Demonstrates some graphics construction and placement techniques.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoGraphics1 extends Applet

{

   String companyName = new String("Event Handlers Incorporated");

   Font bigFont = new Font("Helvetica", Font.ITALIC, 24);

   public void paint(Graphics gr)

   {

      gr.setFont(bigFont);
      gr.setColor(Color.magenta);
      gr.drawString(companyName,10,100);
      gr.setColor(Color.orange);
      gr.drawString(companyName,40,140);

   }

} // class DemoGraphics1
