
package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class E1_Examples {
	public static void main (String[] arg) {
		int[] arr= {1,2,9,5,8,2,3,4,5,6,7};
		
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	
	ArrayList<Integer> sorted = new ArrayList<>();
		
		for(int num: arr) {
			if (!sorted.contains(num)) {
				sorted.add(num);
				System.out.print(num+" ");
			}
		}
		
		//System.out.println(Arrays.toString(sorted));
	}

}
