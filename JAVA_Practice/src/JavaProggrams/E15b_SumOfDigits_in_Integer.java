package JavaProggrams;

public class E15b_SumOfDigits_in_Integer {
	public static void main(String[] args) {
		int n = 987, sum = 0;
		while(n!=0) {
			sum = sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}


}
//Additioning of all numbers