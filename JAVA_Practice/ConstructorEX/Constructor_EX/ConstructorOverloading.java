package Constructor_EX;


	
	class Student {
		int id;
		String name;

		//No parameter constructor
		Student() {
			System.out.println("No Parameter constrcutor is calling");
		}

		//Parameterized constructor
		Student(int i, String n) {
			this.id=i;
			this.name=n;
			System.out.println("Parameterized constrcutor is calling");
		}
	}

	public class ConstructorOverloading {
		public static void main(String[] args) {
			Student st1 = new Student();
			Student st2 = new Student(101, "John");
			
			System.out.println("\n"+st1.id); //o
			System.out.println(st1.name); //null
			System.out.println("\n"+st2.id); //101
			System.out.println(st2.name); //John
		}


}
