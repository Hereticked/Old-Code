// James Poulette   CSC 1500 03

// Demonstrates the use of several string methods.

class Carpe_Diem {

   public static void main (String[] args) {

      String str1 = "Seize the day";
      String str2 = new String();
      String str3 = new String (str1);
      String str4 = "Day of the seize";
      String str5 = "Seize the day";

      System.out.println ("str1: " + str1);
      System.out.println ("str2: " + str2);
      System.out.println ("str3: " + str3);
      System.out.println ("str4: " + str4);
      System.out.println ("str5: " + str5);
      System.out.println();

      System.out.println ("Length of str1: " + str1.length());
      System.out.println ("Length of str2: " + str2.length());
      System.out.println();

      System.out.println ("Index of 'e' in str4: " + str4.indexOf('e'));
      System.out.println ("Last index of 'e' in str4: " + str4.lastIndexOf('e'));
      System.out.println ("The character at position 3 in str1: " + str1.charAt(3));
      System.out.println ("The substring of str1 from position 6 to position 8: " 
			   + str1.substring(6, 9));
      System.out.println();

      if (str1 == str5) {
         System.out.println ("str1 and str5 refer to the same object."); }
      if (str1 != str3) {
         System.out.println ("str1 and str3 do NOT refer to the same object."); }
      if (str1.equals(str3)) {
         System.out.println ("str1 and str3 contain the same characters."); }
      System.out.println();

      str2 = str1.toUpperCase();
      System.out.println ("str2 now refers to: " + str2);
      if (str1.equalsIgnoreCase(str2)) {
         System.out.println ("str1 and str2 contain the same characters (ignoring case)."); }
      str5 = str1.replace('e', 'X');
      System.out.println ("str5 now refers to: " + str5);
      System.out.println();

      System.out.println ("str1 starts with \"Seize\": " + str1.startsWith("Seize"));
      System.out.println ("Creating a string from a number: " + String.valueOf(22+33+44));

   } // method main

} // class Carpe_Diem      

         

      





