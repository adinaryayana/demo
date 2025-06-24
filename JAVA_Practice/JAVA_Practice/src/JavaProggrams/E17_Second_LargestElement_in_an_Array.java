package JavaProggrams;

public class E17_Second_LargestElement_in_an_Array {
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34,1};
		int first = Integer.MIN_VALUE, second = Integer.MAX_VALUE;
		for(int num: arr) {
			if(num>first) {
				second = first;
				first = num;
			}
			else if(num>second && num != first){
				second = num;
			}
		}
		System.out.println(second);
	}

	}

/*/ integer.min_value means the smallest possible integer(-2,147,483,648)
integer.max_value means the largest possible integer(2,147,483,647)

  First iteration (num = 12):
if(num > first): 12 > -2,147,483,648 is true.
second = first: second becomes -2,147,483,648.
first = num: first becomes 12.

Second iteration (num = 35):
if(num > first): 35 > 12 is true.
second = first: second becomes 12.
first = num: first becomes 35.

Third iteration (num = 1):
if(num > first): 1 > 35 is false.
else if(num > second && num != first): 1 > -2,147,483,648 is false, so skip.

Fourth iteration (num = 10):
if(num > first): 10 > 35 is false.
else if(num > second && num != first): 10 > 12 is false, so skip.

Fifth iteration (num = 34):
if(num > first): 34 > 35 is false.
else if(num > second && num != first): 34 > 12 is true, and 34 != 35 is true.
second = num: second becomes 34.

Sixth iteration (num = 1):
if(num > first): 1 > 35 is false.
else if(num > second && num != first): 1 > 34 is false, so skip.

//*/