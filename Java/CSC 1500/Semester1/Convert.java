// James Poulette CSC 1500 03

import java.text.*;

class Convert {

   public static void main (String[] args) {

      final double LIMIT = 212.0, INC = 10.0;
      double FAH_TEMP = 32.0, CEL_TEMP, KEL_TEMP;

      DecimalFormat df1 = new DecimalFormat ("###0.00");
      DecimalFormat df2 = new DecimalFormat ("####0.000");
      DecimalFormat df3 = new DecimalFormat ("####0.0000");

      System.out.println ();
      System.out.println ("                James Poulette's Java Temperature Table");
      System.out.println ("                ---------------------------------------");
      System.out.println ();
      System.out.println ("      Fahrenheit               Celcius                   Kelvin");
      System.out.println ("      ----------               -------                   ------");
   
      while (FAH_TEMP <= LIMIT) {
         CEL_TEMP = 5.0 / 9.0 * (FAH_TEMP - 32.0);
         KEL_TEMP = 5.0 / 9.0 * (FAH_TEMP - 32.0) + 273.15;         
         System.out.println ( "\t" + df1.format(FAH_TEMP) + "\t\t\t" + 
			             df2.format(CEL_TEMP) + "\t\t\t" + 
			             df3.format(KEL_TEMP) );
         FAH_TEMP = FAH_TEMP + INC; 

      } // while loop
   
   } // method main

} // class Convert
