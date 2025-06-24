package Constructor_EX;
	
	
	//class
	class Parent_{
		// zero-parameter constructor
		Parent_(){
			this("Constructor.");
			System.out.println("Parent_ class zero-parameter constrcutor");
		}

		//single parameter constructor
		Parent_(String s) {
			System.out.println("Parent_ class Parameterized "+s);
		}
		
	}

	//class
	class Child_ extends Parent_{
		// zero-parameter constructor
		Child_(){
			this("Constructor.");
			System.out.println("Child_ class zero-parameter constrcutor");
		}

		//single parameter constructor
		Child_(String s) {
			super("Constructor.");
			System.out.println("Child_ class Parameterized "+s);
		}
		
	}

	//main class
	public class E11_this_super_ConstructorCalls {
		
	
		public static void main(String[] args) {
			Child_ ch = new Child_(); //Execution 1
			Parent_ pr = new Parent_(); //Execution 2
		}


}
