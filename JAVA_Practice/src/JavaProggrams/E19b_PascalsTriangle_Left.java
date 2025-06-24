package JavaProggrams;

public class E19b_PascalsTriangle_Left {
	
		public static void submethod(int n){
			for(int i=1; i<=n; i++){  //loop for Row iterations
				for(int j=i; j<n; j++){  //nested-loop of dec triandle (for space)
					System.out.print("  "); ///////("  ") //2-spaces  //here we want to print spaces only
				}
				for(int k=1; k<=i; k++) {	//columns 
					System.out.print("* ");	//////("* ")  //1-space	//here we want to print *
				}
				System.out.println(); 
			} 
			for(int i=1; i<=n; i++) { 
				for(int j=1; j<=i; j++) {	 
					System.out.print("  "); //2-spaces //inc
				}
				for(int k=i; k<n; k++){  
					System.out.print("* "); //1-space //dec
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			int n = 3;
			submethod(n); 
		}
}

	
