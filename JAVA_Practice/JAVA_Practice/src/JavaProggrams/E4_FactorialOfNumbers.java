package JavaProggrams;

import java.util.Scanner;

public class E4_FactorialOfNumbers {
	
	//Java int coding qns : #4 Factorial of a Number
		 //-----------------factorial of given given number
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++) {
			if(n==0) {
				System.out.println("The factorial of " +n+ " is: "+ 1);
			}
			else {
				fact = fact*i; //or fact *= i;
			}
		}
		System.out.println("The factorial of " +n+ " is: "+ fact);
		sc.close(); 
		} //*/
		


}
