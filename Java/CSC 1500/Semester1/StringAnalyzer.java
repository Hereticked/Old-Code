// James Poulette   CSC 1500 03

// A class that stores strings and provides a bunch of statistics on the sentence
// that is typed in. The string may contain several sentences, each word seperated
// by a single space, each sentence ending with a period, and one space seperating
// each sentence.

class StringAnalyzer {

   public static void main (String[] args) {

      Analyzer str1 = new Analyzer("Is the. Cat little here.");

      System.out.println("\nNumber of sentences:            " + str1.numSentencesOrWords('.'));
      System.out.println("\nNumber of words:                " + str1.numSentencesOrWords(' '));
      System.out.println("\nNumber of characters:           " + str1.numChars());
      System.out.println("\nAverage words per sentence:     " + str1.avgWordsPerSentence());
      System.out.println("\nAverage characters per word:    " + str1.avgCharsPerWord());
      System.out.println("\nLongest word length:            " + str1.longestWordLen());
      System.out.println("\nMost words in a sentence:       " + str1.longestSentence());

   } // method main

} // class StringAnalyzer

class Analyzer {

   private String the_string;

   public Analyzer (String str) {

      the_string = str;

   } // Analyzer constructor

   public int numSentencesOrWords (char ch) {

      int count = 0; // Keeps track of the number of sentences or words.
      int position = 0; // The position in a string of the character in question. (' ' or '.')

      position = the_string.indexOf(ch); // The first index of the character in question.

      while (position != -1) {
         count ++;
         position = the_string.indexOf(ch, position + 1); // Returns index of next character in
      }                                                   // question. Returns -1 if no more.

      if (ch == ' ') { // No space after last word, so increment count.
         count ++;
      }

      return (count);

   }

   public int numChars() {

      return(the_string.length());

   }

   public float avgWordsPerSentence() {

      return((float) numSentencesOrWords(' ') / numSentencesOrWords('.'));

   }

   public float avgCharsPerWord() {

      return((float) numChars() / numSentencesOrWords(' '));

   }

   public int longestWordLen() {

      int largest,      // Keeps track of the length of the longest word.
          position,     // Your current position in the string.
	  lastPosition, // Keep track of your last position.
	  len;          // Length of a word.

      char ch;

      position = the_string.indexOf(' '); // Find first space.
      largest = position;

      while (the_string.charAt(position) != '.') {
         lastPosition = ++position;
	 position = the_string.indexOf(' ', position); // Start looking for a space at position.

         if (position == -1) { // True when space not found.
	    position = the_string.lastIndexOf('.'); // Find position of last period.
	 } // end if

	 len = position - lastPosition;
         ch = the_string.charAt(position - 1);

	 switch (ch) { // Make sure no punctuation marks are counted in the word length.
	    case ',' :
	    case '.' :
	    case ':' :
	    case ';' : len--;
	 } // end switch

	 if (len > largest) { // True when current word is largest so far.
	    largest = len;
	 } // end if
      } // while loop

      return (largest);

   }

   public int longestSentence() {

      int largest,      // Keeps track of the length of the longest sentence.
          position,     // Your current position in the string.
	  count;        // Number of words in a sentence.

      position = the_string.indexOf(' '); // Find first space.
      count = 1; // Initialized because JDK 1.7 gives initialization error otherwise.
      largest = 1; // Also initialized because according to program guidlines, string must
                   // have at least one word.

      while (position != -1) {

	 ++position;
	 position = the_string.indexOf(' ', position);
	 ++count;
         
         if (count > largest) {
            largest = count;
	 } // end if

         if (position != -1) { // Check for this only if a space was found. 
            if (the_string.charAt(position - 1) == '.') {
	       count = 0;
	    } // end if
	 } // end if

      } // end while 

      return (largest);

   } // method longestSentence

} // class Analyzer
