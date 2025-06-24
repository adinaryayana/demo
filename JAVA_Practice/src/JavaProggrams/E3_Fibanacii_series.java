		
		
package JavaProggrams;

public class E3_Fibanacii_series {
	
	//Java int coding qns : #3 Fobonacci series
	//--------------------fibonacci numbers print based on given value
	public static void main(String[] args) {
		int a=0,
		b=1,
		sum=a+b;
		System.out.print(a+", "+b+", ");
		while(sum<=100) {
			System.out.print(sum+", ");
			//to swap the values
			a=b;
			b=sum;
			sum=a+b;
			} 
		}//*/


}

//0,1,1,2,3,5,8,13,21,34,55,89