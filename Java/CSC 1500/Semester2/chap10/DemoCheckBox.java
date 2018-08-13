// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// DemoCheckBox.java
// Chapter 10B Page 479
// Known Bugs : None

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoCheckBox extends Applet implements ItemListener

{

   String companyName = new String("Event Handlers Incorporated");
   Font bigFont = new Font("Arial", Font.PLAIN, 24);
   Checkbox cocktailBox = new Checkbox("Cocktails");
   Checkbox dinnerBox = new Checkbox("Dinner");
   int cocktailPrice = 300, dinnerPrice = 600, totalPrice = 200;

   public void init()

   {

      add(cocktailBox);
      cocktailBox.addItemListener(this);
      add(dinnerBox);
      dinnerBox.addItemListener(this);

   }

   public void paint(Graphics gr)

   {

      gr.setFont(bigFont);
      gr.setColor(Color.magenta);
      gr.drawString(companyName,10,100);
      gr.drawString("Event pirce estimate",10,150);
      gr.setColor(Color.blue);
      gr.drawString(Integer.toString(totalPrice),280,150);

   }

   public void itemStateChanged(ItemEvent check)

   { 

      totalPrice = 200;
      if(cocktailBox.getState())

      {

         totalPrice += cocktailPrice;

      }

      if(dinnerBox.getState())

      {

         totalPrice += dinnerPrice;

      }

      repaint();

   }
   
} // class DemoCheckBox
