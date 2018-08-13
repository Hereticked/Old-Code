// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// FontList.java   pages 345 - 346
// Known Bugs : None

// Displays a list of fonts available on your computer.

import java.applet.*;
import java.awt.*;

public class FontList extends Applet

{

   int x = 10, y = 15;

   public void paint(Graphics gr)

   {

      String availableFonts[] = Toolkit.getDefaultToolkit().getFontList();

      for(int a = 0; a < availableFonts.length; ++a)

         gr.drawString(availableFonts[a], x, y += 15);

   }

} // class FontList
