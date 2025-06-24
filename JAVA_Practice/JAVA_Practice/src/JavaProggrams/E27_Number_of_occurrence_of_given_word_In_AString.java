package JavaProggrams;

public class E27_Number_of_occurrence_of_given_word_In_AString {
	public static void main(String[] args) {
		String string = "Java is a programming language. java is widely used in software testing";
		String word = "java";
		
		String[] words = string.toLowerCase().split(" ");
		int occurrence = 0;
		for(int i=0; i<words.length; i++) {
			if(words[i].equals(word)) {
				occurrence++;
			}
		}
		System.out.println(occurrence);
	} //*/


}
