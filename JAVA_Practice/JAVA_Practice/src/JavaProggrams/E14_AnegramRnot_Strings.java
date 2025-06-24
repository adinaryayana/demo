package JavaProggrams;

import java.util.Arrays;

public class E14_AnegramRnot_Strings {                             //by using same letters of the word if create another word is called anagram Ex: listen  silent
	
	public static void main(String[] args) {
		String str1 = "army", str2 = "Mary"; //Brag, Grab

		// Converting both the string to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Checking for the length of strings
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the arrays to character array
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			// Sorting the arrays using in-built function sort()
			Arrays.sort(ch1); ////// Sorting is the process of putting the list or group of items in a specific order.
			Arrays.sort(ch2);

			// Comparing both the arrays using in-built function equals ()
			if (Arrays.equals(ch1, ch2) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	} // */


}
