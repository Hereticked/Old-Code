// James Poulette
// CSC 1550 03
// 99 - 04 - 04
// ThreeStars.java   pages 343 - 344
// Known Bugs : None

// Draws a polygon and makes copies of it.

import java.applet.*;
import java.awt.*;

public class ThreeStars extends Applet

{

   int xPoints[] = {42, 52, 72, 52, 60, 40, 15, 28, 9, 32, 42};
   int yPoints[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};

   Polygon aStar = new Polygon(xPoints, yPoints, xPoints.length);

   public void paint(Graphics gr)

   {

      gr.setColor(Color.red);
      gr.drawPolygon(aStar);
      gr.copyArea(0,0,75,105,125,130);
      gr.copyArea(0,0,75,105,180,70);

   }

} // class ThreeStars
