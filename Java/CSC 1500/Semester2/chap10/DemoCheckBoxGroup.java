// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// DemoCheckBoxGroup.java
// Chapter 10B Page 483
// Known Bugs : Compile Error - DemoCheckBoxGroup.java:81: Class dinnerGrp.getSelectedCheckbox not // found.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoCheckBoxGroup extends Applet implements ItemListener

{

   String companyName = new String("Event Handlers Incorporated");
   Font bigFont = new Font("Arial", Font.PLAIN, 24);
   Checkbox cocktailBox = new Checkbox("Cocktails");
   Checkbox dinnerBox = new Checkbox("Dinner");
   CheckboxGroup dinnerGrp = new CheckboxGroup();
   Checkbox chickenBox = new Checkbox("Chicken", false, dinnerGrp);
   Checkbox beefBox = new Checkbox("Beef", false, dinnerGrp);
   Checkbox fishBox = new Checkbox("Fish", false, dinnerGrp);
   int cocktailPrice = 300, dinnerPrice = 600, totalPrice = 200;

   public void init()

   {

      add(cocktailBox);
      cocktailBox.addItemListener(this);
      add(dinnerBox);
      dinnerBox.addItemListener(this);
      add(chickenBox);
      chickenBox.addItemListener(this);
      add(beefBox);
      beefBox.addItemListener(this);
      add(fishBox);
      fishBox.addItemListener(this);

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
      int beefPrice = 100, fishPrice = 75;

      CheckboxGroup dinnerGrp = new CheckboxGroup();
      Checkbox chickenBox = new Checkbox("Chicken", false, dinnerGrp);
      Checkbox beefBox = new Checkbox("Beef", false, dinnerGrp);
      Checkbox fishBox = new Checkbox("Fish", false, dinnerGrp);
      
      if(cocktailBox.getState())

      {

         totalPrice += cocktailPrice;

      }

      if(dinnerBox.getState())

      {

         totalPrice += dinnerPrice;
         Checkbox dinnerSelection = new dinnerGrp.getSelectedCheckbox();
         if(dinnerSelection == beefBox)
           totalPrice += beefPrice;
         else if(dinnerSelection == fishBox)
           totalPrice += fishPrice;
         else
           chickenBox.setState(true);

      }

      repaint();

   }

} // class DemoCheckBoxGroup
