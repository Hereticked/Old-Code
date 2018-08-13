// James Poulette   CSC 1500 03

import java.applet.Applet;
import java.awt.*;

// Draws a stick figure

public class Stick_Figure extends Applet {

	public void paint (Graphics page) {

		page.drawOval (50, 50, 30, 30);
		
		page.drawLine (65, 80, 65, 140);

		page.drawLine (65, 140, 35, 160);

		page.drawLine (65, 140, 95, 160);

		page.drawLine (65, 105, 30, 105);

		page.drawLine (65, 105, 100, 80);

	} // method paint

} // class Stick_Figure

