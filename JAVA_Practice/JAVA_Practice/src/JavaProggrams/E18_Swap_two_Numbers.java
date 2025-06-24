package JavaProggrams;

public class E18_Swap_two_Numbers {
	public static void main(String[] args) {
		int a= 20, b=9;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of a "+a);
		System.out.println("The value of b "+b);
	}

}
