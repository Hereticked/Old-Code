// James Poulette
// CSC 1550 03
// 99 - 05 - 01
// DemoGrid.java
// Chapter 11A Page 511
// Known Bugs : None

import java.applet.*;
import java.awt.*;

public class DemoGrid extends Applet

{

   private Button nb = new Button("North Button");
   private Button sb = new Button("South Button");
   private Button eb = new Button("East Button");
   private Button wb = new Button("West Button");
   private Button cb = new Button("Center Button");

   public void init()

   {

      setLayout(new GridLayout(2,3));
      add(nb, "North");
      add(sb, "South");
      add(eb, "East");
      add(wb, "West");
      add(cb, "Center");

   }

} // class DemoGrid
