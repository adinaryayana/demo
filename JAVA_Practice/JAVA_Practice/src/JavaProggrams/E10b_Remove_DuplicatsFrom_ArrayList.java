

package JavaProggrams;

import java.util.ArrayList;
import java.util.Arrays;

public class E10b_Remove_DuplicatsFrom_ArrayList {
	
	public static void main(String[] args) {
		int[] arr = {14,15,14,8,4,10,12,11};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> uniqueElements = new ArrayList<>();
		
		for(int num: arr) {
			if(!uniqueElements.contains(num)) {
				uniqueElements.add(num);
				System.out.print(num+" ");
			}
		}
	}

	}

