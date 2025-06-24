package Practice;

public class E29_Try_Without_Catch {
	
	public static void main(String[] args) {
		try {
			int b = 10/0;
		} finally {
			System.out.println("Finally block statement will get execute regadless of exception");
		}
	}


}
