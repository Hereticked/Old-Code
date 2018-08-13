// James Poulette   CSC 1500 03

// Instantiates an object to monitor the value of a
// collection of musical CDs

class Tunes {

   public static void main (String[] args) {

      CD_Collection music = new CD_Collection (5, 59.69);

      music.add_cds (1, 10.99);
      music.add_cds (3, 39.34);
      music.add_cds (2, 24.73);

      music.print();

      music.add_cds (2, 20.82);
      music.add_cds (4, 46.90);

      music.print();

   } // method main

} // class Tunes

// Represents a collection of CDs

class CD_Collection {

   private int num_cds;
   private double value_cds;

   public CD_Collection (int initial_num, double initial_val) {
      num_cds = initial_num;
      value_cds = initial_val;
   } // constructor CD_Collection

   public void add_cds (int number, double value) {
      num_cds = num_cds + number;
      value_cds = value_cds + value;
   } // method add_cds

   public void print() {
      System.out.println ("*****************");
      System.out.println ("Number of CDs: " + num_cds);
      System.out.println ("Value of collection $" + value_cds);
      System.out.println ("Average cost per CD: $" + average_cost());
   } // method print

   private double average_cost() {
      return value_cds / num_cds;
   } // method average_cost

} // class CD_Collection