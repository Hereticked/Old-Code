// James Poulette
// CSC 1550 03   
// 99 - 02 - 15
// PetAdvice.java   Page 174 #6
// Known Bugs : None

// Gives you advice on which pet to buy based on what you input.

public class PetAdvice {

   public static void main(String[] args) throws Exception {

      char dwelling, hours;

      System.out.println();
      System.out.println("What type of residence do you live in?");
      System.out.println();
      System.out.println("A) Apartment");
      System.out.println("H) House");
      System.out.println("D) Dormitory");
      System.out.println();

      dwelling = (char)System.in.read();

      System.in.read();
      System.in.read();

      System.out.println();
      System.out.println("How many hours are you home in an average day?");
      System.out.println();
      System.out.println("V) 18 or more");
      System.out.println("W) 10 to 17");
      System.out.println("X) 8 to 9");
      System.out.println("Y) 6 to 7");
      System.out.println("Z) 0 to 5");
      System.out.println();

      hours = (char)System.in.read();

      System.out.println();

      if((dwelling == 'A') || (dwelling == 'a')) {
         if((hours == 'V') || (hours == 'v') || (hours == 'W') || (hours == 'w'))
            System.out.println("Get a cat");
         else
            if((hours == 'X') || (hours == 'x') || (hours == 'Y') || (hours == 'y') || (hours == 'Z') || (hours == 'z'))
               System.out.println("Get a Hamster");
            else
               System.out.println("Invalid answer to the second question");
      }

      if((dwelling == 'H') || (dwelling == 'h')) {
         if((hours == 'V') || (hours == 'v'))
            System.out.println("Get a Pot bellied pig");
         else
            if((hours == 'W') || (hours == 'w') || (hours == 'X') || (hours == 'x'))
               System.out.println("Get a Dog");
            else
               if((hours == 'Y') || (hours == 'y') || (hours == 'Z') || (hours == 'z'))
                  System.out.println("Get a Snake");
               else
                  System.out.println("Invalid answer to the second question");
      }

      if((dwelling == 'D') || (dwelling == 'd')) {
         if((hours == 'V') || (hours == 'v') || (hours == 'W') || (hours == 'w') || (hours == 'X') || (hours == 'x') || (hours == 'Y') || (hours == 'y'))
            System.out.println("Get a Fish");
         else
            if((hours == 'Z') || (hours == 'z'))
               System.out.println("Get an Ant farm");
            else
               System.out.println("Invalid answer to the second question");
      }

      if((dwelling != 'A') && (dwelling != 'a') && (dwelling != 'H') && (dwelling != 'h') && (dwelling != 'D') && (dwelling != 'd')) {
         if((hours != 'V') && (hours != 'v') && (hours != 'W') && (hours != 'w') && (hours != 'X') && (hours != 'x') && (hours != 'Y') && (hours != 'y') && (hours != 'Z') && (hours != 'z'))
            System.out.println("Invalid answers to both questions");
         else
            System.out.println("Invalid answer to the first question");
      }

   } // method main

} // class PetAdvice

// Output :

/* 

C:\Program Files\JDK\bin>java PetAdvice

What type of residence do you live in?

A) Apartment
H) House
D) Dormitory

A

How many hours are you home in an average day?

V) 18 or more
W) 10 to 17
X) 8 to 9
Y) 6 to 7
Z) 0 to 5

w

Get a cat

C:\Program Files\JDK\bin>java PetAdvice

What type of residence do you live in?

A) Apartment
H) House
D) Dormitory

h

How many hours are you home in an average day?

V) 18 or more
W) 10 to 17
X) 8 to 9
Y) 6 to 7
Z) 0 to 5

Y

Get a Snake

C:\Program Files\JDK\bin>java PetAdvice

What type of residence do you live in?

A) Apartment
H) House
D) Dormitory

J

How many hours are you home in an average day?

V) 18 or more
W) 10 to 17
X) 8 to 9
Y) 6 to 7
Z) 0 to 5

W

Invalid answer to the first question

C:\Program Files\JDK\bin>

*/
