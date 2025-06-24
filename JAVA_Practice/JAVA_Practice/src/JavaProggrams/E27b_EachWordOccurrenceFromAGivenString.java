package JavaProggrams;

import java.util.HashMap;
import java.util.Map;

public class E27b_EachWordOccurrenceFromAGivenString {
	public static void main(String[] args) {
		String string = "Alice is a Girl and Bob is a Boy";
		Map<String, Integer> hm = new HashMap<>(); //or HashMap<String, Integer>();
		
		String[] words = string.split(" "); //it divides space then it becomes array ["Alice", "is", "a", "Girl", "and", "Bob", "is", "a", "Boy"]
		for(String word: words) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}
			else {
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
	}

	

}

/*/Let’s trace the loop for the array ["Alice", "is", "a", "Girl", "and", "Bob", "is", "a", "Boy"]:
"Alice": Not in HashMap → Add with count 1 → {"Alice": 1}
"is": Not in HashMap → Add with count 1 → {"Alice": 1, "is": 1}
"a": Not in HashMap → Add with count 1 → {"Alice": 1, "is": 1, "a": 1}
"Girl": Not in HashMap → Add with count 1 → {"Alice": 1, "is": 1, "a": 1, "Girl": 1}
"and": Not in HashMap → Add with count 1 → {"Alice": 1, "is": 1, "a": 1, "Girl": 1, "and": 1}
"Bob": Not in HashMap → Add with count 1 → {"Alice": 1, "is": 1, "a": 1, "Girl": 1, "and": 1, "Bob": 1}
"is": Already in HashMap (count 1) → Increment to 2 → {"Alice": 1, "is": 2, "a": 1, "Girl": 1, "and": 1, "Bob": 1}
"a": Already in HashMap (count 1) → Increment to 2 → {"Alice": 1, "is": 2, "a": 2, "Girl": 1, "and": 1, "Bob": 1}
"Boy": Not in HashMap → Add with count 1 → {"Alice": 1, "is": 2, "a": 2, "Girl": 1, "and": 1, "Bob": 1, "Boy": 1}//*/
