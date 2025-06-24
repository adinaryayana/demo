package Constructor_EX;

public class Copy_Constructor {

	
	String name;
	int age;
	
	Copy_Constructor (){
		System.out.println("No-parameter Constructor is calling");
	}
	
	Copy_Constructor(String n, int a){
		this.name=n;
		this.age=a;
		System.out.println("---2 Parameter constrcutor is calling---");
		System.out.println(name);
		System.out.println(age);
	}
	
	Copy_Constructor(Copy_Constructor p){
		this.name=p.name;
		this.age=p.age;
		System.out.println("---1 Parameter constrcutor is calling---");
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Copy_Constructor cc1 = new Copy_Constructor(); //Constructor 1
		Copy_Constructor cc2 = new Copy_Constructor("Jhony", 38); //Constructor 2
		Copy_Constructor cc3 = new Copy_Constructor(cc2); //Constructor 3
		
	}

}
