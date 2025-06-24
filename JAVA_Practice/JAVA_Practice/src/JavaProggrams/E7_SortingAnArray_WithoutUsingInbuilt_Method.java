package JavaProggrams;

import java.util.Arrays;

public class E7_SortingAnArray_WithoutUsingInbuilt_Method {
	
	//Java int coding qns : #7b Sort An Array Without using inbuilt method
		//#2
		public static void main(String[] args) {
			int arr[] = {5,2,8,7,1};
			System.out.println("Original array:");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			int temp=0;
				for(int i=0; i<arr.length; i++) {
					for(int j=i+1; j<arr.length; j++) {
						if(arr[j]<arr[i]) {
							
							temp= arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
						
					}
				}
			
				
		System.out.println("Original array:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		} //*/

}


/*/ pass 1(i=0)    52871
 
j=i+1 = 1
arr[j]<arr[i]
arr[1]<arr[0]
2<5 ,true

swapping:
temp=arr[i]
arr[i]=arr[j];
arr[j]=temp;

o/p: 2 5 8 7 1
------

j=2
arr[j]<arr[i]
arr[2]<arr[0]
8<2 ,false

j=3
arr[j]<arr[i]
arr[3]<arr[0]
7<2 ,false

j=4
arr[j]<arr[i]
arr[4]<arr[0]
1<2 ,true

swap :
	15872//*/






