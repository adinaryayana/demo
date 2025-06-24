
package Practice;

public class E22_Check_IntOrNot {
	
	int i = 12345; /////input is Integer type
	
	
	//to convert 'int' to 'String'
	String str = String.valueOf(i);
	
	//Checking whether 'str' is String or not
	boolean result = true;
	for(int a=0; a<str.length(); a++) {
		if(!Character.isDigit(str.charAt(a))) {
			result = false;
		}
	}
	if(result) {
		System.out.println("Given input '"+i+"' and it's data type '"+ str.getClass().getSimpleName()+"' containing all digits so it is in Integer format");
	}
}


}
