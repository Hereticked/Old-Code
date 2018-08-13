class PayDay {

  public static void main (String[] args) {
  
      double hours = Double.valueOf(args[0]).doubleValue();
      double rate = Double.valueOf(args[1]).doubleValue();
      double pay;
      
      if (hours > 40) {
        pay = rate * 40 + 1.5 * rate * (hours - 40);      
      }
      else {
        pay = rate * hours;
      }
         
      System.out.println("The paycheck is " + pay + " dollars.");
      if ( rate < 7.25) {
        System.err.println("This employee is not getting the legally required minimum wage.");     
      }
      if ( hours > 7*24) {
        System.err.println("Did this employee really work " + hours + " hours?");     
      }
  
  }

}