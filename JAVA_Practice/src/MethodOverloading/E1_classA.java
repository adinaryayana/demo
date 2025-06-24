package MethodOverloading;

public class E1_classA {
	
	void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}

	void add(int a, int b, int c) {
		int d = a+b-c;
		System.out.println(d);
	}

	void add(double a, int b, int c) {
		double d = (a+b)*c;
		System.out.println(d);
	}

	void add(String str, int i) {
		System.out.println(str+" , "+i);
	}

	static void add2() {
		System.out.println("add2() method is calling");
	}


}
