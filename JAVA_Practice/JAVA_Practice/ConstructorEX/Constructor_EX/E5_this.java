package Constructor_EX;

public class E5_this {
	
	String make;
	String model;
	int year;
	
	//parameterized constructor
	E5_this(String make1, String model1, int year1){
		//initializing
		this.make=make1;
		this.model=model1;
		this.year=year1;
		System.out.println("car make:  "+make+"\ncar model:  "+model+"\ncar manuf year:  "+year);
	}
	
	
	//method
	void driver() {
		System.out.println("Car is driving");
	}
	public static void main(String[] arg) {
		E5_this obj = new E5_this("kia", "Ev", 2025);
		obj.driver();
		
		

}
}
