// James Poulette
// CSC 1550 03
// 99 - 03 - 22
// MoveLabel.java   pages 303 - 305
// Known Bugs : None

// Moves the text across the applet whenever the button is pushed. The button is disabled before
// the text can move off the applet window.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MoveLabel extends Applet implements ActionListener

{

   Label movingMsg = new Label("Event Handlers Inc.");

   Button pressButton = new Button("Press");

   int xLoc = 20, yLoc = 20;

   public void init()

   {

      add(movingMsg);
      add(pressButton);
      pressButton.addActionListener(this);

   }

   public void actionPerformed(ActionEvent e)

   {

      movingMsg.setLocation(xLoc+=10, yLoc+=10);

      if(yLoc == 280)

         pressButton.setEnabled(false);

   }

} // class MoveLabel
