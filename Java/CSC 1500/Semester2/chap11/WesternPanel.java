// James Poulette
// CSC 1550 03
// 99 - 05 - 01
// WesternPanel.java
// Chapter 11A Page 513
// Known Bugs : None

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class WesternPanel extends Applet implements ActionListener

{

   Button wyButton = new Button("Wyoming");
   Button coButton = new Button("Colorado");
   Button nvButton = new Button("Neveda");
   Label infoLabel = new Label(" Location Info ");
   

   public WesternPanel()

   {

      setLayout(new GridLayout(2,2));
      add(wyButton);
      wyButton.addActionListener(this);
      add(coButton);
      add(nvButton);
      add(infoLabel);

   }
 
   public void actionPerformed(ActionEvent e)

   {

      infoLabel.setText("Cody");

   }

} // class WesternPanel
