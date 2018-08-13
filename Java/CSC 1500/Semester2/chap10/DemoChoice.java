// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// DemoChoice.java
// Chapter 10B Page 487
// Known Bugs : None

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoChoice extends Applet implements ItemListener

{

   String companyName = new String("Event Hanlders Incorporated");
   Font bigFont = new Font("Arial", Font.PLAIN, 24);
   int totalPrice = 0;

   Choice entertainmentChoice = new Choice();
   int[] actPrice = {0,725,325,125};

   public void init()

   {

      add(entertainmentChoice);
      entertainmentChoice.addItemListener(this);
      entertainmentChoice.add("No entertainment");
      entertainmentChoice.add("Rock band");
      entertainmentChoice.add("Pianist");
      entertainmentChoice.add("Clown");

   }

   public void paint(Graphics gr)

   {

      gr.setFont(bigFont);
      gr.setColor(Color.magenta);
      gr.drawString(companyName,10,100);
      gr.drawString("Price for entertainment",10,150);
      gr.setColor(Color.blue);
      gr.drawString(Integer.toString(totalPrice),280,150);

   }

   public void itemStateChanged(ItemEvent choice)

   {

      int actNum = entertainmentChoice.getSelectedIndex();
      totalPrice = actPrice[actNum];
      repaint();

   }

} // class DemoChoice
