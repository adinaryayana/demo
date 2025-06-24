package Constructor_EX;


	
	//class
	class A{
		//No parameter constructor
		A(){
//			this(" "); //Compile-time error: we can't able to call constructors recursively
			System.out.println("No parameter constructor");
		}
		
		//parameterized constructor
		A(String s){
//			this(); //Compile-time error: we can't able to call constructors recursively
			System.out.println("parameterized constructor");
		}
	}

	public class CantAbleToCallConstructorCallsRecursively {
		public static void main(String[] args) {
			A obj = new A();
		}


}
