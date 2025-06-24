package JavaProggrams;

public class E26_char_occurrence_InGiven_String {
	//-----------------------to find number of occurrence of "char"
	public static void main(String[] args) {
		String str = "LT LiveTech EE";
		int ecount=0;
		int tcount=0;
		String ucStr = str.toLowerCase();
		System.out.println(ucStr);
		for(int i=0; i<=ucStr.length()-1; i++) {
			if(ucStr.charAt(i)=='e') {	//comparing with lower letter take toLowerCase() or comparing with higher letter take toUpperCase()
				ecount++;
			}
		}
		for(int i=0; i<=ucStr.length()-1; i++) {
			if(ucStr.charAt(i)=='t') {	//comparing with lower letter take toLowerCase() or comparing with higher letter take toUpperCase()
				tcount++;
			}
		}
		System.out.println("occurence of e is: "+ecount); 
		System.out.println("occurence of t is: "+tcount); 
	} //*/


}
