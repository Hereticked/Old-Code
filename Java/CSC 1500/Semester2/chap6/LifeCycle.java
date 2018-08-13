// James Poulette
// CSC 1550 03
// 99 - 03 - 22
// LifeCycle.java   pages 292 - 195
// Known Bugs : None

// Uses several methods to demonstrate the applet "life cycle".

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class LifeCycle extends Applet implements ActionListener

{

   Label messageInit = new Label("init ");
   Label messageStart = new Label("start ");
   Label messageDisplay = new Label("display ");
   Label messageAction = new Label("action ");
   Label messageStop = new Label("stop ");
   Label messageDestroy = new Label("destroy");

   Button pressButton = new Button("Press");

   int countInit, countStart, countDisplay, countAction, countStop, countDestroy;

   public void init()

   {

      ++countInit;
      add(messageInit);
      add(messageStart);
      add(messageDisplay);
      add(messageAction);
      add(messageStop);
      add(messageDestroy);
      add(pressButton);
      pressButton.addActionListener(this);
      display();

   }

   public void start()

   {

      ++countStart;
      display();

   }

   public void display()

   {

      ++countDisplay;
      messageInit.setText("init " + countInit);
      messageStart.setText("start " + countStart);
      messageDisplay.setText("display " + countDisplay);
      messageAction.setText("action " + countAction);
      messageStop.setText("stop " + countStop);
      messageDestroy.setText("destroy " + countDestroy);

   }

   public void stop()

   {

      ++countStop;
      display();

   }

   public void destroy()

   {

      ++countDestroy;
      display();

   }

   public void actionPerformed(ActionEvent e)

   {

      ++countAction;
      display();

   }

} // class LifeCycle
