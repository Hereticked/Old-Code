// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// StopLight.java   pages 354 - 357
// Known Bugs : None

// Stoplight changes and a different message is displayed whenever the button is pushed.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class StopLight extends Applet implements ActionListener

{

   String msg = new String();

   Font serifItalic = new Font("Serif", Font.ITALIC, 20);

   Button stopStart = new Button("Press");

   int buttonCount = 0;
   int leading, ascent, descent, height, width;

   static final int BORDER = 5;

   int redX = 30, redY = 60, yellowX = redX, yellowY = redY + 60, greenX = redX,
      greenY = redY + 120;

   public void init()

   {

      add(stopStart);
      stopStart.addActionListener(this);

   }

   public void paint(Graphics gr)

   {

      int x, y;

      gr.setColor(Color.black);
      gr.drawRect(redX - 20, redY - 40, 80, 240);

      gr.setFont(serifItalic);
      gr.setColor(Color.yellow);
      gr.fillOval(yellowX, yellowY, 50, 50);

      if(buttonCount % 2 == 1)

      {

         msg = "Go call Event Handlers now!";
         x = greenX + 90;
         y = greenY;
         gr.setColor(Color.green);
         gr.drawString(msg, x, greenY);
         gr.fillOval(greenX, y, 50, 50);

      }

      else

      {

         msg = "Stop making plans on your own!";
         x = redX + 90;
         y = redY;
         gr.setColor(Color.red);
         gr.drawString(msg, x, redY);
         gr.fillOval(redX, y, 50, 50);

      }

      leading = gr.getFontMetrics().getLeading();
      ascent = gr.getFontMetrics().getAscent();
      descent = gr.getFontMetrics().getDescent();
      height = gr.getFontMetrics().getHeight();
      width = gr.getFontMetrics().stringWidth(msg);
      gr.drawRect(x - BORDER, y - (ascent + leading + BORDER), width + 2 * BORDER,
         height + 2 * BORDER);

   }

   public void actionPerformed(ActionEvent e)

   {

      ++ buttonCount;
      repaint();

   }

} // class StopLight
