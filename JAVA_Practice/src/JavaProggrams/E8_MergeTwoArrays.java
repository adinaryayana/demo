package JavaProggrams;

import java.util.Arrays;

public class E8_MergeTwoArrays {

	//Java int coding qns : #8 Merge Two Arrays
	
		public static void main(String[] args) {
			int[] arr1 = {1, 3, 5};
			int[] arr2 = {2, 4, 6};
			
			int[] merged = new int[arr1.length + arr2.length];
			
			// System.arraycopy() method is used to copy elements from both arrays into the result array
			System.arraycopy(arr1, 0, merged, 0, arr1.length);
			System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
			
			System.out.println(Arrays.toString(merged));
		}
	}

/*/
 
 The program uses System.arraycopy() to copy elements from arr1 and arr2 into merged.
First System.arraycopy call:
System.arraycopy(arr1, 0, merged, 0, arr1.length);
This copies all elements of arr1 (starting from index 0) into merged (starting at index 0).
arr1.length = 3, so it copies {1, 3, 5}.
After this step, merged is: {1, 3, 5, 0, 0, 0} (the last 3 elements are still 0 because they haven't been filled yet).

Second System.arraycopy call:
System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
This copies all elements of arr2 (starting from index 0) into merged (starting at index arr1.length = 3).
arr2.length = 3, so it copies {2, 4, 6}.
After this step, merged is: {1, 3, 5, 2, 4, 6}.//*/


