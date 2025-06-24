package Constructor_EX;

public class E1_Parameter_vr_Arguments {
	
	//
	public static int multiply(int a, int b) { //Parameters: Parameters are variables these are declared in method signature
		return a*b;
	}
	
	public static void main(String[] args) {
		int a=4, b=5;
		
		int product = multiply(a, b); //Arguments: Arguments are variables or values are declared at the time of method calling.
		System.out.println("After multiply a and b value:  "+product);
	} //*/
}
	
	
	
	
	/*/public static int m(int a, int b) {
		return a*b;
		
	}
	public static void main(String[] args) {
	    
	    int product =  m(10, 5); 
	    System.out.println(product);
	     
}
	
	


}//*/
