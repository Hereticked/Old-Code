class ConditionalDemo2 {

     public static void main(String[] args){
          int value1 = 1;
          int value2 = 2;
          int result;
          boolean someCondition = true;
          result = someCondition ? value1 : value2;

		// If someCondition is true, assign the value of value1 to result. 
                // Otherwise, assign the value of value2 to result

          System.out.println(result);

     }
}