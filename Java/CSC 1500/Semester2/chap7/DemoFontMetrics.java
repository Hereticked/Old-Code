// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// DemoFontMetrics.java   pages 347 - 350
// Known Bugs : None

// Generates and displays statistics on the various fonts being used.

import java.applet.*;
import java.awt.*;

public class DemoFontMetrics extends Applet

{

   String companyName = new String("Event Handlers Incorporated");

   Font courierItalic = new Font("Courier", Font.ITALIC, 16);
   Font timesPlain = new Font("TimesRoman", Font.PLAIN, 16);
   Font helvetBold = new Font("Helvetica", Font.BOLD, 16);

   int ascent, descent, height, leading;
   int x = 10, y = 15;

   static final int INCREASE = 15;

   public void paint(Graphics gr)

   {

      gr.setFont(courierItalic);
      gr.drawString(companyName, x, y);
      displayMetrics(gr);

      gr.setFont(timesPlain);
      gr.drawString(companyName, x, y += 40);
      displayMetrics(gr);

      gr.setFont(helvetBold);
      gr.drawString(companyName, x, y += 40);
      displayMetrics(gr);

   }

   public void displayMetrics(Graphics g)

   {

      leading = g.getFontMetrics().getLeading();
      ascent = g.getFontMetrics().getAscent();
      descent = g.getFontMetrics().getDescent();
      height = g.getFontMetrics().getHeight();

      g.drawString("Leading is " + leading, x, y += INCREASE);
      g.drawString("Ascent is " + ascent, x, y += INCREASE);
      g.drawString("Descent is " + descent, x, y += INCREASE);
      g.drawString("- - - - - ", x, y += INCREASE);
      g.drawString("Height is " + height, x, y += INCREASE);

   }

} // class DemoFontMetrics
