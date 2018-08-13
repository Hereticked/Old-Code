public void writeList() {
    PrintWriter out = null;

    try {
        System.out.println("Entering try statement");
        out = new PrintWriter(
	                  new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " 
                             + vector.elementAt(i));
		  
    } catch (ArrayIndexOutOfBoundsException e) {
         System.err.println("Caught " 
                     + "ArrayIndexOutOfBoundsException: " 
                     +   e.getMessage());
				 
    } catch (IOException e) {
         System.err.println("Caught IOException: " 
                             +  e.getMessage());
				 
    } finally {
         if (out != null) {
             System.out.println("Closing PrintWriter");
             out.close();
		
         } 
         else {
             System.out.println("PrintWriter not open");
         }
     }
}