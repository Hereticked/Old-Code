// James Poulette
// CSC 1550 03
// 99 - 04 - 30
// FrameYouCanClose2.java
// Chapter 10A Page 461
// Known Bugs : None

import java.awt.*;
import java.awt.event.*;

public class FrameYouCanClose2 extends Frame

{

   public FrameYouCanClose2 (String str)

   {

     super(str);
     addWindowListener(new WindowYouCanClose());

   } // method FrameYouCanCLose2

} // class FrameYouCanClose2
