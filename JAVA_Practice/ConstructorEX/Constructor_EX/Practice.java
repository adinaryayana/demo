package Constructor_EX;



class parent{
	int a;
	String b;
 	
	parent(){
		this(5, "edf");
	}
	parent (int A, String B){
		this.a=A;
		this.b=B;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}

class child extends parent{
   
	private String name;
	 
	child() {
		super(8, "adi");
		this.name="Google";
		System.out.println("Child class:"+name);
		
	}
	
}

public class Practice {
	public static void main(String[] args) {
		 child obj = new child();
		 parent obj1 = new parent();
	}
	
	
	
		
	}

