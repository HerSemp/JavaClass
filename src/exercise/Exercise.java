package exercise;

public class Exercise {
	//Declaring string variales
	public String str1 = "Habibi Come to Dubai";
	public String str2 = "Habibi You have Dollars?";
	public String str3 = "Habibi you are broke";

	//Creating constructor
	public Exercise() {
		
	}
	
	//Creating static method
	public static float greeting() {
		return 2.2f;
	}

	//creating final method
	public final double balance() {
		return 18.6;
	}
	
	//main method
	public static void main(String[] args) {
		//creating object
		Exercise pr = new Exercise();
		
		//printing variables
		System.out.println(pr.str1);
		System.out.println(pr.str2);
		System.out.println(pr.str3);
		
		//creating variable for float
		float mymessage = Exercise.greeting();
		System.out.println(mymessage);
		
		//creating double variable
		double account = pr.balance();
		System.out.println("Hemanth account balance is "+account);

	}

}
