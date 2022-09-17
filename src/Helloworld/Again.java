package Helloworld;

public class Again {
	//Declaring a variable
	public int b = 200;
	
	public Again() {
		//empty constructor
		
	}
	
	public static void main(String[] args) {
		//Creating an object for again class
		Again hello = new Again();
		
		//creating an object for Helloworld class from other file
		HelloWorld hello2 = new HelloWorld();
		
		//printing data from classes
		System.out.println(hello.b);
		System.out.println(hello2.a);
	}
	

}
