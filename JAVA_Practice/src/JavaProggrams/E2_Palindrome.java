package JavaProggrams;

public class E2_Palindrome {
	
	// Java int coding qns : #2 Check for Palindrome
	// -----------------------Palindrome String
	public static void main(String[] args) {
	String str = "Refer";
	String strRev = "";
	//to reverse given string 
	for(int i=str.length()-1; i>=0; i--) {
		strRev=strRev+str.charAt(i);
	}
	System.out.println("String after reverse:  "+strRev);
	}

 }


/*/	if(str.equalsIgnoreCase(strRev)) {
		System.out.println("Given string is palindrome");
	}
	else {
		System.out.println("Given string is not palindrome");
	}
	} //*/
	
	
	

	/*/ -----------------------Palindrome Number
	public static void main(String[] args) {
		int num = 12321;
		int intRev = 0;

		if (isPalindrome(num))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");///
	} 

	
	public static boolean isPalindrome(int num) {
		int originalNum = num;
		int revNum = 0;

		while (num != 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		return originalNum == revNum;
	} //*/
	
	
	
	// -----------------------Palindrome Number scenario3
	
/*/	public static void main(String[] args) {
		
		String x = "abcdcba";
		int i=0; 
		int j= x.length()-1;
		
		while(i<j)
		{
			if(x.charAt(i)!=x.charAt(j))
			{
				System.out.println("Not palindrome");
				System.exit(0);
				
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");
	}



}  //*/
