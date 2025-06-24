
package Constructor_EX;

public class E7_this {
	
private int x, y; //Declaration
	
	//constructor
	public E7_this() {
		this(6, 8);    //it will expect two parameter constructor
	}

	//parameterized constructor
	public E7_this(int X, int Y) {
		this.x=X;
		this.y=Y;
	}
	
	public static void main(String[] args) {
		E7_this obj = new E7_this();
		
		System.out.println("x value:  "+obj.x);
		System.out.println("y value:  "+obj.y);
	}


}
