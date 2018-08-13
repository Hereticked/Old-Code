// James Poulette
// CSC 1550 03
// 99 - 04 - 18
// DemoEntertainment.java
// Chapter 9A Pages 419 - 420
// Known Bugs : None

// Demonstrates using the MusicalEntertainment and OtherEntertainment classes.

public class DemoEntertainment

{

   public static void main(String[] args) throws Exception

   {

      System.out.println("Create a musical act description :");

      MusicalEntertainment anAct = new MusicalEntertainment();

      System.out.println("\nCreate a non-musical act description :");

      OtherEntertainment anotherAct = new OtherEntertainment();

      System.out.println("\nDescription of entertainment acts :");

      System.out.println(anAct.toString());
      System.out.println(anotherAct.toString());

   } // method main

} // class DemoEntertainment

// Output :

/*

C:\Program Files\jdk1.2\bin>javac OtherEntertainment.java

C:\Program Files\jdk1.2\bin>java DemoEntertainment
Create a musical act description :
Enter name of entertainer Your Mother
What type of music do they play? death metal

Create a non-musical act description :
Enter name of entertainer Your Daddy
What type of act is this? suicide

Description of entertainment acts :
Your Mother, featuring death metal music. Fee is $600 per event.
Your Daddy, a suicide. Fee is $50 per hour.

C:\Program Files\jdk1.2\bin>

*/
