package JavaProggrams;

public class E1_ReverceString {     //1 Reverse a String
	
	 	public static void main(String[] args) {
	 		
	 		String str = "odd Events";
	 		String rev ="";
	 		for(int i=str.length()-1; i>=0; i--) {     //length()-1  is
//	 			rev=rev+str.charAt(i);
	 			//or
	 			rev += str.charAt(i);
	 		}
	 		System.out.println(rev);
	 	} //*/
	 	
	 	
	 	/*/#2
		public static void main(String[] args) {
			String str = "Automation";
			StringBuffer rev = new StringBuffer(str).reverse(); //or StringBuilder()
			
			System.out.println(rev);
			
		} //*/
	 	



}
