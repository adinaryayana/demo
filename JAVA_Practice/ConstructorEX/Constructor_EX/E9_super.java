package Constructor_EX;


	
	
	//class
	class Fruit {
		int x = 12;
		void print() {
			System.out.println("Fruit class method");
		}
	}

	//class
	class Mango extends Fruit {
		void demo() {
			System.out.println("Mango class method");
			System.out.println(super.x);
			super.print();
			System.out.println("Mango class method");
		}
	}

	//main class
	public class E9_super {
		public static void main(String[] args) {
			Mango mg = new Mango();
			mg.demo();
		}


}
