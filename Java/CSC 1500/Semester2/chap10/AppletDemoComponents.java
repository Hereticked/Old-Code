// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// AppletDemoComponents.java
// Chapter 10A Page 467
// Known Bugs : None

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletDemoComponents extends Applet implements ActionListener

{

   private FrameYouCanClose fycc = new FrameYouCanClose("Demo Components");
   private Button showFrame = new Button ("Press Me");
   Label msg1 = new Label("Event Handlers Inc.");
   Label msg2 = new Label("Plan with us!");
   Label msg3 = new Label("You just go relax. We'll manage the fuss.");
   int pressCounter = 0;
   
   public void init()

   {

      add(showFrame);
      fycc.setSize(200, 150);
      fycc.setLocation(100, 100);
      showFrame.addActionListener(this);

   }

   public void actionPerformed (ActionEvent e)

   {

      if(pressCounter == 0)

      {

         fycc.add(msg1);

      }

      else

      {

         if(pressCounter == 1)

         {

            fycc.remove(msg1);
            fycc.add(msg2);

         }

         else

         {

            if(pressCounter == 2)

            {

               fycc.remove(msg2);
               fycc.setSize(400, 150);
               fycc.add(msg3);

            }

         }

      }

      if(pressCounter < 3)

      {

         fycc.setVisible(true);

      }

      else

      {

         fycc.setVisible(false);

      }
     
      if(pressCounter == 4)

      {

       showFrame.setEnabled(false);

      }

      ++pressCounter;

   }

} // class AppletDemoComponents
