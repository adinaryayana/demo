package Practice;

public class E28_Try_Catch_finally {
	
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("from try block");
			System.out.println(str.length());
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("from catch block");
		} finally {
			System.out.println("from finally block");
		}
		
		System.out.println("Out side of catch block");
	}


}
