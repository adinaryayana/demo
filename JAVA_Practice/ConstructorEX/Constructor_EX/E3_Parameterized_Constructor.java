package Constructor_EX;

public class E3_Parameterized_Constructor {
	
	//parameterized constructor
	E3_Parameterized_Constructor(int a, int b){
			System.out.println("addition of a and b values: "+ (a+b));
		}
		
		public static void main(String[] args) {
			E3_Parameterized_Constructor obj = new E3_Parameterized_Constructor(12, 9); 
		}


}
