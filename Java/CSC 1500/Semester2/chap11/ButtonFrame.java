// James Poulette
// CSC 1550 03
// 99 - 05 - 01
// ButtonFrame.java
// Chapter 11B Page 531
// Known Bugs : None

import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends Frame implements ActionListener

{

   Button redButton = new Button("Red");
   Button blueButton = new Button("Blue");
   Button greenButton = new Button("Green");

   public ButtonFrame()

   {

      setLayout(new FlowLayout());
      setTitle("Button Frame");
      redButton.addActionListener(this);
      add(redButton);
      blueButton.addActionListener(this);
      add(blueButton);
      greenButton.addActionListener(this);
      add(greenButton);

   }

   public void actionPerformed(ActionEvent e)

   {

      if (e.getSource() == redButton)
        setBackground(Color.red);
      else if (e.getSource() == blueButton)
        setBackground(Color.blue);
      else setBackground(Color.green);

   }

} // class ButtonFrame
