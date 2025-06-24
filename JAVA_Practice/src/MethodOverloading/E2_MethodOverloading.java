package MethodOverloading;

public class E2_MethodOverloading {
	
	public void sum(int a, int b) {
		System.out.println("Sum: "+(a+b));
	}
	
	public void sum(double a, double b) {
		System.out.println("Sum: "+(a+b));
	}
	
	public static void main(String[] args) {
		E2_MethodOverloading obj =  new E2_MethodOverloading();
		obj.sum(2,5);
		obj.sum(2.5, 3.5);
	}


}
