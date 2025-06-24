package Practice;

import java.util.ArrayList;
import java.util.Collection;

public class E19_Collection_EX {
	
	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		
		System.out.println("Collection data: "+fruits);
		
		//if 'Banana' is exist inside collection
		System.out.println("Is contains 'Balana' inside collection:  "+fruits.contains("Banana"));
		
		//iterate through elements
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}


}
