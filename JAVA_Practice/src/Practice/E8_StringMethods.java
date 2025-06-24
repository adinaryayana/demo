

package Practice;

import java.util.Arrays;

public class E8_StringMethods {
	
	public static void main(String[] args) {
		String str = "Narayana"; 
		
		String str2_ = "Narayana";
		String str3_ = new String("Narayana");
		String str4_ = null;
		String str5_ = " ";
		String str6_ = "";
		String str7_ = "Kakani";
		String str6 = " kakani narayana";
		String str7 = "Java tutorial point";
		
		/*/length()
		System.out.println(str.length()); //*/
		
		/*/charAt() //Assume 1st letter is in 0 position, 2nd letter is in 1st position, 3rd letter is in 2nd position.........etc
		System.out.println(str.charAt(0)); 
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2)); 
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(7)); //*/
		
		/*/indexOf()
		System.out.println(str.indexOf("n"));
		System.out.println("character 'y' is in  "+str.indexOf("y")+ "  position"); //*/
		
		/*/toUpperCase()
		System.out.println(str.toUpperCase()); //*/
		
		/*/toLowerCase()
		System.out.println(str.toLowerCase()); //*/
		
		/*/equals - for content comparison
		System.out.println(str.equals("Narayana"));	
		System.out.println(str.equals("NarayaNa"));	
		System.out.println(str.equals("Narayaana"));	
		System.out.println(str.equals(str3_)); //*/
		
		/*/Assign is for address/location and content comparison
		System.out.println(str==str3_); //*/
		
		/*/equalsIgnoreCase()
		System.out.println(str.equalsIgnoreCase("Naraydsana"));  //*/ 
		
		/*/startsWith()
		System.out.println(str.startsWith("Nara")); 
		System.out.println(str.startsWith("rana")); 
		System.out.println(str.startsWith("nana"));  //*/
		
		/*/endsWith()
		System.out.println(str.endsWith("yana")); 
		System.out.println(str.endsWith("Nara")); 
		System.out.println(str.endsWith("nara"));  //*/
		
		/*/contains()
		System.out.println(str.contains("yana")); 
		System.out.println(str.contains("nara"));  //*/
		
		/*/isEmpty()
		System.out.println(str.isEmpty());    //false
		System.out.println(str5_.isEmpty()); //String str5_ = " "; //false
		System.out.println(str6_.isEmpty()); //String str6_ = ""; //true
		System.out.println(str4_.isEmpty()); //String str4_ = null; //throw null pointer Exception //*/
		
		//concat()
		System.out.println(str.concat(str7_)); //*/
		
		/*/trim()
		System.out.println(str6.length()); //Retrieving length
		System.out.println(str6.trim().length()); //printing length after trimming spaces //*/
		
		//replace()
		System.out.println(str.replace("N", "O")); //*/
		
		/*/replaceAll()
		String str_ = str.toLowerCase().replaceAll("a", "U");
		System.out.println(str_); //*/
		
		/*/replaceFirst()
		String str_ = str.toLowerCase().replaceFirst("a", "@");
		System.out.println(str_); //*/
		
		//subString()
		System.out.println("sub string:"+str.substring(3)); //index  
		System.out.println(str.substring(7)); //index  //*/
		
		//split()
		String[] newString = str6.split(" ");
		System.out.println(Arrays.toString(newString));
		
		String[] newString2 = str7.split(" ");//String str7 = "Java tutorial point"; //Array string
		System.out.println(Arrays.toString(newString2));//*/
		
		
		
	}


}
