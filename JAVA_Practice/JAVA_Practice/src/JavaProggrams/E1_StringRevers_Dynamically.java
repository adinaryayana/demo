package JavaProggrams;

import java.util.Scanner;

public class E1_StringRevers_Dynamically {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	
	int num = sc.nextInt();
	int rev = 0;
	while (num!=0)
	{
		rev = rev*10+num%10;
		num = num/10;
	}
	System.out.println("Reverse Number is:"+rev);
 
    }
	
	}

