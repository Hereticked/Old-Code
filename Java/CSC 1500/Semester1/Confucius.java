// James Poulette   CSC 1500 03

import java.applet.Applet;
import java.awt.*;

// Prints a quote from Confucius. Uses the drawString method
// in an applet.

public class Confucius extends Applet {

	public void paint (Graphics page) {

		page.drawString ("Forget injuries, never forget kindness.", 50, 50);

		page.drawString ("-- Confucius", 70, 70);

	} // method paint

} // class Confucius