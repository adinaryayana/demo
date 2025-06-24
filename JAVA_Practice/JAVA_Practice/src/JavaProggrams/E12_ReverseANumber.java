package JavaProggrams;

public class E12_ReverseANumber {
	public static void main(String[] args) {
		int num = 12345, reversed = 0;
		while(num != 0) {
			int digit = num % 10; // to extract the last digit
			reversed = reversed*10 + digit; // Build the reversed number
			num /= 10; // Remove the last digit from the original number
		}
		System.out.println(reversed);
	}


}
