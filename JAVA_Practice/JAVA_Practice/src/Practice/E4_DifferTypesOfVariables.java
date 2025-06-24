package Practice;

public class E4_DifferTypesOfVariables {
	//Globle variable can access through out the class
	
	int i=10;  //static or instance variable
	static int j=5;  //stativ variable   //static variable methode we can call with class name only
	public static void main(String[] arg) {
		//Local Variable can access through out the method only
		
		boolean result = false;
		System.out.println(result);
		
		E4_DifferTypesOfVariables obj1=new E4_DifferTypesOfVariables();
		obj1.m1();
		
		System.out.println(E4_DifferTypesOfVariables.j);
		
	}
	
	void m1() {
		System.out.println(i);
		//System.out.println(result);    getting error because it is local variable of another methodes
	}

}
