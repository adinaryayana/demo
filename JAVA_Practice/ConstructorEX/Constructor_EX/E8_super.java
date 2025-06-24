package Constructor_EX;


	class Parent{
		void print() {
			System.out.println("Parent class method");
		}
	}

	//class
	class Child extends Parent{
		void print() {
			super.print();
			System.out.println("Child class method");
		}
	}

	//main class
	public class E8_super {
		public static void main(String[] args) {
			Child cc = new Child();
			cc.print();
		}
	}



