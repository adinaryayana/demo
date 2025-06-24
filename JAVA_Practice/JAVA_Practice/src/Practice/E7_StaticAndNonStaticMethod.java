package Practice;

public class E7_StaticAndNonStaticMethod {
	
	//Non-static methods because we are not using static key word
	public void m1() {
		System.out.println(" print m1");
		
	}
	private void m2() {
		System.out.println(" print m2");
		
	}
	void m3() {
		System.out.println(" print m3");
		
	}
	protected void m4() {
		System.out.println(" print m4");
		
	}
	
	//static methods because we are using static key word
	
	public static void m5() {
		System.out.println(" print m5");
		
	}
	private static void m6() {
		System.out.println(" print m6");
		
	}
	static void m7() {
		System.out.println(" print m7");
		
	}
	protected static void m8() {
		System.out.println(" print m8");
	
	}
		public static void main(String[] args) {
			
			
			E7_StaticAndNonStaticMethod obj = new E7_StaticAndNonStaticMethod();
			obj.m1();
			obj.m2();
			obj.m3();
			obj.m4();
			
			E7_StaticAndNonStaticMethod.m5();
			E7_StaticAndNonStaticMethod.m6();
			E7_StaticAndNonStaticMethod.m7();
			E7_StaticAndNonStaticMethod.m8();
			
		}
			
		

}
