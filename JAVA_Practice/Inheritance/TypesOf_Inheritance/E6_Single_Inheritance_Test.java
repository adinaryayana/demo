package TypesOf_Inheritance;

public class E6_Single_Inheritance_Test extends E6_Single_Inheritance_1 {
	
	public void userLoigin() {
		System.out.println("userLoigin() method is calling");
	}
	
	//main method
	public static void main(String[] args) {
		E6_Single_Inheritance_Test obj = new E6_Single_Inheritance_Test();
		obj.setUp();
		obj.userLoigin();
		obj.tearDown();
	}


}
