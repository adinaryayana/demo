package JavaProggrams;

public class E11_CheckArmstrongNumber {         //`each raised to the power of the total number of digits,equals the number itself
	public static void main(String[] args) {
		int num = 153, sum = 0, temp = num;
		while(temp != 0) {
			int digit = temp % 10;
			sum += java.lang.Math.pow(digit, 3);
			temp /= 10;
		}
		System.out.println(num == sum); 
	} //*/


}

/*/num=153, sum=0, temp=num
while(temp!=0), true
int digit=temp%10
         =153%10
         =3
    temp/10=15     

	//*/

/*/
The while(temp != 0) loop runs as long as temp is not zero.
Inside the loop:
int digit = temp % 10;: Extracts the last digit of temp using the modulo operator (%). For temp = 153, the first digit extracted is 3.
sum += java.lang.Math.pow(digit, 3);: Calculates the cube of the digit using Math.pow(digit, 3) and adds it to sum. For digit = 3, this is 3^3 = 27, so sum becomes 27.
temp /= 10;: Removes the last digit from temp by integer division. temp becomes 15.
The loop repeats:
Second iteration: temp = 15, digit = 5, sum = 27 + 5^3 = 27 + 125 = 152, temp = 1.
Third iteration: temp = 1, digit = 1, sum = 152 + 1^3 = 152 + 1 = 153, temp = 0.
The loop ends when temp becomes 0.
Output:
System.out.println(num + " = " + sum);: Prints the result. Here, num is 153 and sum is 153, so it outputs: 153 = 153. //*/