// James Poulette
// CSC 1550 03
// 99 - 03 - 22
// PartyPlanner.java   pages 266 - 267
// Known Bugs : None

// Asks you how many people are going to your party and displays how much your event will cost.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PartyPlanner extends Applet implements ActionListener

{

   Font bigFont = new Font("Helvetica", Font.ITALIC, 24);

   Label companyName = new Label("Event Handlers Incorporated");
   Button calcButton = new Button("Calculate");
   Label prompt = new Label("Enter the number of guests at your event");
   TextField numGuests = new TextField("",5);
   Label perPersonResult = new Label("Plan with us.");
   Label totalResult = new Label("The more the merrier!");

   public void init()

   {

      companyName.setFont(bigFont);
      add(companyName);
      add(prompt);
      add(numGuests);
      add(calcButton);
      calcButton.addActionListener(this);
      numGuests.addActionListener(this);
      add(perPersonResult);
      add(totalResult);

   }

   public void start()

   {

      perPersonResult.setText("Plan with us.");
      numGuests.setText("0");
      totalResult.setText("The more the merrier!");
      invalidate();
      validate();

   }

   public void actionPerformed(ActionEvent e)

   {

      int[] guestLimit = {0, 25, 50, 100, 200, 500, 1000};
      int[] ratePerGuest = {27, 25, 22, 19, 17, 14, 11};

      int guests = Integer.parseInt(numGuests.getText());

      int individualFee = 0, eventFee = 0;
      int x = 0, a = 0;

      for(x = 5; x >= 0; --x)

         if(guests >= guestLimit[x])

            {

               individualFee = ratePerGuest[x];
               eventFee = guests * individualFee;
               x = 0;

            }

      perPersonResult.setText("$" + individualFee + " per person");
      totalResult.setText("Event cost $" + eventFee);

   }

} // class PartyPlanner
