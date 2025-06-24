package JavaProggrams;

public class E20_Array_Print_missing_number {
	static void printMissingElements(int[] arr, int n) {

		
		int diff = arr[0] - 0; // arr[i]-i

		for (int i = 0; i < n; i++) {
			if (arr[i] - i != diff) {
				while
					(diff < arr[i] - i) {
					System.out.print((i + diff) + " ");
					diff++;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 10, 11, 13 };
		int n = arr.length;

		printMissingElements(arr, n);
	} // */

}

/*/ int diff = arr[0] - 0; calculates the initial difference. Since arr[0] = 1, diff = 1 - 0 = 1.
Loop Through Array: for (int i = 0; i < n; i++)
Iterates from i = 0 to i = n-1 (0 to 7), covering all elements in the array.
Check for Missing Numbers:
Inside the loop: if (arr[i] - i != diff)
This condition checks if the difference between the current element arr[i] and its index i deviates from the initial diff.
If true, it means there are missing numbers between arr[i-1] and arr[i].
While Loop to Print Missing Numbers: while (diff < arr[i] - i)
This loop prints the missing numbers by adding diff to i until the difference matches arr[i] - i.
System.out.print((i + diff) + " "); prints the missing number.
diff++; increments diff to check for the next missing number.
After the while loop (or if the condition is false), update diff = arr[i] - i; to set the new difference for the next iteration.
Step-by-Step Execution for arr = {1, 2, 4, 6, 7, 10, 11, 13}:
Initial Setup: diff = arr[0] - 0 = 1 - 0 = 1.
Loop Iterations:
i = 0: arr[0] = 1, arr[0] - 0 = 1 - 0 = 1, matches diff = 1. No missing numbers. diff = 1.
i = 1: arr[1] = 2, arr[1] - 1 = 2 - 1 = 1, matches diff = 1. No missing numbers. diff = 1.
i = 2://*/



