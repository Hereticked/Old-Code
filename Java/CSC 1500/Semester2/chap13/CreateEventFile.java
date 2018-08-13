// James Poulette and Jamie Rudat
// CSC 1550 03
// 99 - 05 - 04
// CreateEventFile.java
// Chapter 13B Pages 601 - 606
// Known Bugs : None

// GUI interface that can capture data about an event from the user and 
// write the data to an output file. Writes formatted file data.

import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class CreateEventFile extends Frame implements ActionListener, WindowListener

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
   private Button enterDataButton = new Button ("Enter data");
   DataOutputStream ostream;

   public CreateEventFile()

   {

      super ("Create Event File");

      try

      {

         ostream = new DataOutputStream (new FileOutputStream("events.dat"));

      }

      catch (IOException e)

      {

         System.out.println ("File not opened");
         System.exit(1);

      }

      setSize (350, 200);
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
      add (enterDataButton);

      enterDataButton.addActionListener(this);
      setVisible(true);
      addWindowListener(this);

   }

   public void actionPerformed (ActionEvent e1)

   {

      int numGuests;
      try

      {

         numGuests = Integer.parseInt (guests.getText());
         ostream.writeUTF(host.getText());
         ostream.writeUTF(date.getText());
         ostream.writeInt(numGuests);
         host.setText("");
         date.setText("");
         guests.setText("");

      }

      catch (NumberFormatException e2)

      {

         System.err.println ("Invalid number of guests");

      }

      catch (IOException e3)

      {

         System.err.println ("Error writing file");
         System.exit(1);

      }

   }

   public void windowClosing (WindowEvent e)

   {

      try

      {

         ostream.close();

      }

      catch (IOException e2)

      {

         System.err.println ("File not closed");
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

} // class CreateEventFile
