// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// BoxAround.java   pages 351 - 353
// Known Bugs : None

// Displays a string and places a box around it.

import java.applet.*;
import java.awt.*;

public class BoxAround extends Applet

{

   String companyName = new String("Event Handlers Incorporated");

   Font serifItalic = new Font("Serif", Font.ITALIC, 20);

   int leading, ascent, height, width;
   int x = 40, y = 60;

   static final int BORDER = 5;

   public void paint(Graphics gr)

   {

      gr.setFont(serifItalic);
      gr.drawString(companyName,x,y);
      leading = gr.getFontMetrics().getLeading();
      ascent = gr.getFontMetrics().getAscent();
      height = gr.getFontMetrics().getHeight();
      width = gr.getFontMetrics().stringWidth(companyName);
      gr.drawRect(x - BORDER, y - (ascent + leading + BORDER), width + 2 * BORDER,
         height + 2 * BORDER);

   }

} // class BoxAround
