package JavaProggrams;

public class E5_PrimeNumberCheck {
	
	//Java int coding qns : #5 Prime Number Check
	//prime numbers and prime number check
	public static void main(String[] args) {
		for(int n=1; n<=30; n++) {
			int count=0;                    //here count is the number of dividers for the n number
			for(int i=1; i<=n; i++) {
				if(n%i==0) {                 
					count++;
				}
			}
			if(count==2) {
				System.out.print(n+", ");
			}
		}
	}
}//*/
	
/*/ n = 1:
Inner loop: i from 1 to 1.
i = 1: 1%1 == 0, so count = 1.
count == 1 (not 2), so 1 is not prime. No output.
n = 2:
Inner loop: i from 1 to 2.
i = 1: 2%1 == 0, count = 1.
i = 2: 2%2 == 0, count = 2.
count == 2, so 2 is prime. Output: 2, .
n = 3:
Inner loop: i from 1 to 3.
i = 1: 3%1 == 0, count = 1.
i = 2: 3%2 != 0, count stays 1.
i = 3: 3%3 == 0, count = 2.
count == 2, so 3 is prime. Output: 3, .
n = 4:
Inner loop: i from 1 to 4.
i = 1: 4%1 == 0, count = 1.
i = 2: 4%2 == 0, count = 2.
i = 3: 4%3 != 0, count stays 2.
i = 4: 4%4 == 0, count = 3.
count == 3 (not 2), so 4 is not prime. No output.
This continues up to n = 30.
Final Output
The prime numbers between 1 and 30 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.//*/


		   

		
		
		
		

	


