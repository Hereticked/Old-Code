// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// ReadEventFile.java
// Chapter 13B Pages 608 - 611
// Known Bugs : None

// Frame for viewing file data. Reads formatted file data.

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ReadEventFile extends Frame implements ActionListener, WindowListener

{

   private Label coName = new Label ("Event Handlers Inc.");
   Font bigFont = new Font ("Helvetica", Font.ITALIC, 24);
   private Label prompt = new Label ("Enter this month's events");
   private TextField host = new TextField(10);
   private TextField date = new TextField(4);
   private TextField guests = new TextField(4);
   private Label hLabel = new Label ("Host");
   private Label dLabel = new Label ("Date");
   private Label gLabel = new Label ("Guests");
   private Button viewEventButton = new Button ("View Event");
   DataInputStream istream;

   public ReadEventFile()

   {

      super ("Read Event File");

      try

      {

         istream = new DataInputStream (new FileInputStream("events.dat"));

      }

      catch (IOException e)

      {

         System.err.println ("File not opened");
         System.exit(1);

      }

      setSize (375, 200);
      setLayout (new FlowLayout());
      coName.setFont (bigFont);
      add (coName);
      add (prompt);
      add (hLabel);
      add (host);
      add (dLabel);
      add (date);
      add (gLabel);
      add (guests);
      add (viewEventButton);

      viewEventButton.addActionListener(this);
      setVisible(true);
      addWindowListener(this);

   }

   public void actionPerformed (ActionEvent e1)

   {

      String theHost, theDate;
      int numGuests;

      try

      {

         theHost = istream.readUTF();
         theDate = istream.readUTF();
         numGuests = istream.readInt();
         host.setText(theHost);
         date.setText(theDate);
         guests.setText(String.valueOf(numGuests));

      }

      catch (EOFException e2)

      {

         closeFile();

      }

      catch (IOException e3)

      {

         System.err.println ("Error reading file");
         System.exit(1);

      }

   }

   public void closeFile()

   {

      try

      {

         istream.close();
         System.exit(0);

      }

      catch (IOException e)

      {

         System.err.println ("Error closing file");
         System.exit(1);

      }

   }

   public void windowClosing (WindowEvent e)

   {

      try

      {

         istream.close();

      }

      catch (IOException e2)

      {

         System.err.println ("File already closed");
         System.exit(1);

      }

      System.exit(0);

   }

   public void windowClosed (WindowEvent e) {}
   public void windowDeiconified (WindowEvent e) {}
   public void windowIconified (WindowEvent e) {}
   public void windowOpened (WindowEvent e) {}
   public void windowActivated (WindowEvent e) {}
   public void windowDeactivated (WindowEvent e) {}

} // class ReadEventFile
