package Practice;

public class E3_UserDefinedMethodes {
	
	String str="mango";
	String[] str1={"Apple", "banana","draksha"}	;	//Array type string
	
	
	void subMethode1() {
		System.out.println("subMethode1 is calling");
		System.out.println(str1);
	}
		void subMethode2() {
			System.out.println("subMethode2 is calling");
		}
			void subMethode3() {
				System.out.println("subMethode3 is calling");
			}
				public static void main(String[] arg) {
					System.out.println("main() method is calling");
					
					E3_UserDefinedMethodes	obj1 = new E3_UserDefinedMethodes();
					obj1.subMethode1();
					obj1.subMethode2();
					obj1.subMethode3();
					
				}
}
