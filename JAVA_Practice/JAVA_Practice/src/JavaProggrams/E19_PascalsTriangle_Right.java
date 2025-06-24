
package JavaProggrams;

public class E19_PascalsTriangle_Right {
	//Right Pascals Triangle
	//pattern incT of *--DecT of * 
	public static void submethod(int n) {
		for(int i=1; i<n; i++) { //if i<=n one extra row will print 
			for(int j=1; j<=i; j++) { //incT of *
				System.out.print("* "); 
			} 
			System.out.println();
		}
		for(int i=1; i<=n; i++) { //remove here or above 
			for(int j=i; j<=n; j++){  //DecT of * 
				System.out.print("* ");  
			}  
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 3;
		submethod(n); 
	} 

}
