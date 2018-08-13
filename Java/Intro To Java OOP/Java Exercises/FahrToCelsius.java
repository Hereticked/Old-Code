// Print a Fahrenheit to Celsius table

class FahrToCelsius  {

  public static void main (String args[]) {
  
    double fahr, celsius;

    for (fahr = 0.0; fahr <= 100; fahr += 20.0) { 
      celsius = (5.0 / 9.0) * (fahr-32.0);
      System.out.println(fahr + " " + celsius);
    } 

  } 

}