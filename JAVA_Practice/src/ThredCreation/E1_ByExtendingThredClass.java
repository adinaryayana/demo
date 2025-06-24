package ThredCreation;

public class E1_ByExtendingThredClass extends Thread {
	
	public void run() {
		System.out.println("Thread is under running....");
		for(int i=1; i<=5; i++) {
			System.out.println("i= "+i);
		}
	}
	
	public static void main(String[] args) {
		E1_ByExtendingThredClass t1 = new E1_ByExtendingThredClass();
		System.out.println("Thread about to start....");
		
		t1.start();
	}


}
