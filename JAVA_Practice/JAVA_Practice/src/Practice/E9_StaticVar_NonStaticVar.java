
package Practice;

public class E9_StaticVar_NonStaticVar {
	
	static int staticVar = 10;
	int nonStaticVar = 20;
	
	void display() {
		System.out.println("display() is called");
		System.out.println("Static Variable: "+staticVar);
		System.out.println("Non static Variable: "+nonStaticVar);
	}
	
	public static void main(String[] args) {
		E9_StaticVar_NonStaticVar obj = new E9_StaticVar_NonStaticVar();
		
		//to call display() method
		obj.display();
		
		//to call static and non-static variables
		System.out.println("\nCalling static and nonstatic variables");
		System.out.println(obj.nonStaticVar);
		System.out.println(E9_StaticVar_NonStaticVar.staticVar);
		
	}


}
