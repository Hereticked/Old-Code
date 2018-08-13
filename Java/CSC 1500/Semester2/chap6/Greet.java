// James Poulette
// CSC 1550 03
// 99 - 03 - 10
// Greet.java   pages 273 - 284
// Known Bugs : None

// Introduction to Applets

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Greet extends Applet implements ActionListener

{

   Label greeting = new Label("Hello. Who are you?");

   Font bigFont = new Font("TimesRoman", Font.ITALIC,24);

   Button pressMe = new Button("Press Me");

   TextField answer = new TextField("",10);

   public void init()

   {

      greeting.setFont(bigFont);

      add(greeting);

      add(answer);

      add(pressMe);

      answer.requestFocus();

      pressMe.addActionListener(this);

      answer.addActionListener(this);

   }

   public void actionPerformed(ActionEvent thisEvent)

   {

      String name = answer.getText();
      System.out.println("Hi there " + name);

      Label personalGreeting = new Label("");
      personalGreeting.setText("Hi " + name);
      add(personalGreeting);

      remove(answer);
      remove(pressMe);

      invalidate();
      validate();

   }

}
