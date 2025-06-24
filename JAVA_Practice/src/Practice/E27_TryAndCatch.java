package Practice;

public class E27_TryAndCatch {
	
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch(Exception e) {
			System.out.println("Devided by zero");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
			
		}
		
		System.out.println("Out side of catch block");

}
}
