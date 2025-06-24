package Constructor_EX;


	
	//class
	class ParentEmployee {
		 String name;
		 int age;

		// zero-parameter constructor
		ParentEmployee() {
			this("John_T", 32);    //it will looking for two parameter constructor
		}
		
		//2 parameter constructor
		ParentEmployee(String n, int a){
			this.name=n;
			this.age=a;
			System.out.println("PE:  "+n);
			System.out.println("PE:  "+a);
		}
		
	}

	//class
	class ChildEmployee extends ParentEmployee{
		private String company;
		
		// zero-parameter constructor
		ChildEmployee(){
			super("John_S", 42);
			this.company= "Google";
			System.out.println(company);
		}
		
	}

	//main class
	public class E10_this_super_constructorcalls {
		//Chaining the constructors
		public static void main(String[] args) {
			ChildEmployee ce = new ChildEmployee(); //Execution 1
			ParentEmployee pe = new ParentEmployee(); //Execution 2
			
	
		}
	}



	


