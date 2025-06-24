package JavaProggrams;

import java.util.Arrays;

public class E29_MoveAllZerosToLeft {
	//
	public static void moveZerosToLeft(int[] arr) {
		if (arr == null || arr.length == 0) {
			return; 
		}

		System.out.println("Array length:  "+arr.length);
		int nonZeroIndex = arr.length - 1;
		System.out.println(nonZeroIndex);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("arr[i]"+arr[i]);
			if (arr[i] != 0) {
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex--; //nonZeroIndex=nonZeroIndex-1; //i--
			}
			
			
		}

		/*/suparation
		  while (nonZeroIndex >= 0) {
			arr[nonZeroIndex] = 0;
			nonZeroIndex--;
			}//*/
		
		
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 3, 0 };
		
		moveZerosToLeft(arr);
		System.out.println(Arrays.toString(arr));
	} //*/
	 


}


/*/arr = [0, 1, 2, 0, 3, 0]
nonZeroIndex = 5
First Loop (Move Non-Zeros to the Right):
i = 5: arr[5] = 0 (skip), nonZeroIndex = 5
i = 4: arr[4] = 3 (non-zero), arr[5] = 3, nonZeroIndex = 4
i = 3: arr[3] = 0 (skip), nonZeroIndex = 4
i = 2: arr[2] = 2 (non-zero), arr[4] = 2, nonZeroIndex = 3
i = 1: arr[1] = 1 (non-zero), arr[3] = 1, nonZeroIndex = 2
i = 0: arr[0] = 0 (skip), nonZeroIndex = 2
After loop: arr = [0, 1, 2, 1, 2, 3], nonZeroIndex = 2

Second Loop (Fill Left with Zeros):
nonZeroIndex = 2: arr[2] = 0, nonZeroIndex = 1
nonZeroIndex = 1: arr[1] = 0, nonZeroIndex = 0
nonZeroIndex = 0: arr[0] = 0, nonZeroIndex = -1
Loop ends.
Final array: arr = [0, 0, 0, 1, 2, 3]
Output:
Prints: [0, 0, 0, 1, 2, 3]//*/
