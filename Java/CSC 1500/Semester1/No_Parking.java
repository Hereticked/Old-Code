// James Poulette   CSC 1500 03

import java.applet.Applet;
import java.awt.*;

// Draws a "No Parking" sign.

public class No_Parking extends Applet {

	public void paint (Graphics page) {

		page.drawString ("Parking", 50, 50);

		page.drawOval (45, 24, 43, 43);

		page.drawLine (82, 30, 51, 61);

	} // method paint

} // class No_Parking