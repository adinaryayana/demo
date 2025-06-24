package TypesOf_Inheritance;


	
	//class
	class Animal{
		String prStr = "ParentStringContent";
		
		void eat() {
			System.out.println("The Animal is eating");
		}
		void fruit() {
			System.out.println("Eat the fruit");
		}
	}

	//class
	class Dog extends Animal{ //extends keyword is used to establishing the relationship between two classes
		String chStr = "ChildStringContent";
		
		void eat() {
			System.out.println("The Dog is eating");
		}
	}


	//Main class
	public class E1_Single_Inheritance {
		
		
		public static void main(String[] args) {
			Animal si1 = new Dog(); //Parent class reference variable refers to the object of child class (UC) here Class - Animal, class reference - sil, cild class object - new Dog()
			si1.eat(); //The Dog is eating
			si1.fruit();
			
			
			System.out.println(si1.prStr);
			
			/*
			Animal si2 = new Animal();
			si2.eat(); */
			//////OR//////
			
			new Animal().eat(); //The Animal is eating 
		}


}
