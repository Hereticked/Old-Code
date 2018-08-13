// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// DemoList2.java
// Chapter 10B Page 493
// Known Bugs : None

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoList2 extends Applet implements ItemListener

{

    String companyName = new String("Event Handlers Incorporated");
    Font bigFont = new Font("Arial", Font.PLAIN, 24);
    int totalPrice = 0;

    List partyFavorList = new List();
    int[] favorPrice = {8,10,25,35};
    
    public void init()

    {

       add(partyFavorList);
       partyFavorList.setMultipleMode(true);
       partyFavorList.addItemListener(this);
       partyFavorList.add("Hats");
       partyFavorList.add("Streamers");
       partyFavorList.add("Balloons");

    }

    public void paint(Graphics gr)

    { 

       gr.setFont(bigFont);
       gr.setColor(Color.magenta);
       gr.drawString(companyName,10,100);
       gr.drawString("Price for favors",10,150);
       gr.setColor(Color.blue);
       gr.drawString(Integer.toString(totalPrice),280,150);

    }

    public void itemStateChanged(ItemEvent check)

    {

       int[] favorNums = partyFavorList.getSelectedIndexes();
       totalPrice = 0;
       for(int x = 0; x < favorNums.length; ++x)
          totalPrice += favorPrice[favorNums[x]];
       repaint();

    }

} // class DemoList2
