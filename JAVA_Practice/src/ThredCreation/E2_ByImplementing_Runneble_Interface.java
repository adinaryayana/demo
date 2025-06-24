package ThredCreation;

public class E2_ByImplementing_Runneble_Interface implements Runnable {
	
	public void run() {
		System.out.println("Thread is under running....");
		for(int i=1; i<=5; i++) {
			System.out.println("i= "+i);
		}
	}
	
	public static void main(String[] args) {
		E1_ByExtendingThredClass iri = new E1_ByExtendingThredClass();
		Thread thread = new Thread(iri);
		
		System.out.println("Thread about to start....");
		
		thread.start();
	}


}
