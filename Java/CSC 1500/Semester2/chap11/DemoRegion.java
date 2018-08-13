// James Poulette
// CSC 1550 03
// 99 - 05 - 01
// DemoRegion.java
// Chapter 11A Page 514
// Known Bugs : None

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoRegion extends Applet

{

   Panel np = new Panel();
   Panel sp = new Panel();
   Panel ep = new Panel();
   Panel cp = new Panel();
   WesternPanel wp = new WesternPanel();
 
   private Button nb = new Button("North Button");
   private Button sb = new Button("South Button");
   private Button eb = new Button("East Button");
   private Button wb = new Button("Western Button");
   private Button cb = new Button("Center Button");

   public void init()

   {

      setLayout(new BorderLayout());
      add(nb, "North");
      add(sb, "South");
      add(eb, "East");
      add(wb, "West");
      add(cb, "Center");

   }

} // class DemoRegion
