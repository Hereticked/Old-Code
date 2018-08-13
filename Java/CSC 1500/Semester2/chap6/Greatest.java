// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// Greatest.java   page 290   #1
// Known Bugs : None

// HERETIC IS THE GREATEST!

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Greatest extends Applet implements ActionListener

{

   Button onlyButton = new Button("Who's the greatest?");

   public void init()

   {

      add(onlyButton);
      onlyButton.addActionListener(this);

   }

   public void actionPerformed(ActionEvent e)

   {

      Label heretic = new Label("HERETIC IS!");
      Font bigFont = new Font("TimesRoman", Font.BOLD, 24);
      heretic.setFont(bigFont);
      add(heretic);
      invalidate();
      validate();

   }

}
