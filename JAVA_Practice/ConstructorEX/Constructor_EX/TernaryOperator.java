package Constructor_EX;

public class TernaryOperator {
	
	
	//Exc 1
	public static void main(String[] args) {
		int num = 1;
		
		//if-else
		String result = (num>0) ? "Positive Number" : "Negetive Number";    //Syn: condition ? expression 1 : expression 2
		System.out.println(result);
	} 
}
	
	
	/*/Exc 2
	public static void main(String[] args) {
		int num = 0;
		
		//if-if-else
		String result = (num>0) ? "Positive Number" : (num<0) ? "Negetive Number" : "Zero";    //Syn: condition ? expression 1 : expression 2
		System.out.println (result);
	 */
     
 
	
	
	/*/Exc 3
	public static void main(String[] args) {
		int count = 1;
		
		while(count<=15) {
			System.out.println((count%2==1) ? "******" : "$$$$$$");
			++count;
		}
		
	}//*/



