package Practice;

public class E11_LoopingCond {
public static void main(String[] args) {
		
		/*/1. For loop
		for(int i=0; i<10; i++) {
			System.out.println("Iteration: "+i);
		} //*/
		
		/*/
		for(;;) {
			System.out.println("iterating infinite times");
		} //*/
		
		/*/
		for(; true ;) {
			System.out.println("loop will run forever!");
		} //*/
		
		/*/
		for(int i=10; i>=0; i--) {
			System.out.println("i ="+i);
		} //*/
		
		
		
		/*/2. for-each / Enhanced for loop
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int arr1: arr) {
			System.out.print(arr1+", ");
		} //*/
		
		/*/3.Nested loop
		
		  for (int i=1; i<10; i++) {
			System.out.println("Outer:"+i);
			for (int j=1; j<5; j++) {
				System.out.println("Inner:"+j);
			}
		}//*/
		
				
		
		/*/3. while
		int n = 1;
		
		while(n<=9) {
			System.out.println("inside while statement printing at iteration: "+n);
			n++;
		} //*/
		
		/*/
		while(true) {
			System.out.println("infi");
		} //*/
		
		/*/
		boolean result = true;
		
		while(result) {
			System.out.println("infi");
			result = false;
		} //*/
		
		
		
	//4. do-while
		int i =1;
		 do {
			 System.out.println("Iteration: "+i);
			 i++;
		 
		
		 }while(i<=10); //*/
}


}
