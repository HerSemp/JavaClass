package myconstruct;

public class Constructs {
	//Declaring class variables
	public int a;
	public int b;
	
	public Constructs(int a1, int b1) {
		//assigning variables
		a = a1;
		b = b1;
		//int c = 14;
		
	}

	public static void main(String[] args) {
		//Creating object of class Constructs
		
		Constructs mine = new Constructs(15,34);
		
		//Printing data from the variable
		System.out.print("The value is: "+mine.a);

	}

}
