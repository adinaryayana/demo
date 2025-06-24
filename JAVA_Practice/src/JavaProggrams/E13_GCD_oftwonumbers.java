
package JavaProggrams;

public class E13_GCD_oftwonumbers {       //GCD:-greatest common divisor
		public static void main(String[] args) {
			// GCD means factorial of two numbers and take maximum common number
			int a = 60, b = 48;
			while(b != 0) {
				int temp = b;
				b = a%b;
				a = temp;
			}
			System.out.println(a);
		}

	}

/*/ just a%b
  remainder=12//*/

/*/initial values: a=60, b=48
  
iteration 1:
	temp = 48
	b=60%48 =12
	a=48
	
	
iteration=2:
	temp=12
	b=48%12=0
	a=12
	
Loop ends (Output is 12)//*/	