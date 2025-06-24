package JavaProggrams;

public class E10_LargestAnd_SmallestElement_InArray {
	
	//Java int coding qns : #10 Largest Element In Array
		public static void main(String[] args) {
			int[] arr1 = {1, 3, 7, 4, 9, 0};
			
			int largest = arr1[0], smallest = arr1[0];
			
			//to find largest number
			for(int num: arr1) {
				if(num>largest) {
					largest = num;
				}
			}
			System.out.println("Largest number:  "+largest);
			
			//to find smallest number
			for(int num: arr1) {
				if(num<smallest) {
					smallest = num;
				}
			}
			System.out.println("Smallest number:  "+smallest);
		}
	}

/*/Largest number
 initially largest= arr1[0]
           largest=1
           num=1
           
           num>largest
           1>1 ,flase
           ---
           
           largest=1
           num=3
           num>largest
           3>1, true
           largest = num
           ---
           
           largest=3
           num=7
           num>largest
           7>3, true
           largest = num
           -----
           
           largest = 7
           num=4
           num>largest
           4>7, false
           ----
           
           largest=7
           num=9
           num>largest
           9>7, true
           largest = num
           ----
           
           largest=9
           num=0
           num>largest
           0>9, false
         
           9 is the largest number in given list
           
 
//*/

