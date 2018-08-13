class SalesTax {

  public static void main (String[] args) {
  
      double price = Double.valueOf(args[0]).doubleValue();
      double salestax = price * 0.0825;     
      System.out.println("Sales tax is " + salestax);
  
  }

}