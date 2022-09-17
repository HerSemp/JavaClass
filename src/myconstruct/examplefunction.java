package myconstruct;

public class examplefunction {
	private int result;
	
	public examplefunction() {
		
	}

	public int value() {
		
		return 1;
	}
	
	public void updater(int a, int b) {
		result = a+b;
	}
	public static void main(String[] args) {
		
		examplefunction ne = new examplefunction();
		ne.updater(12, 43);
		System.out.println("The result is: "+ne.result);

	}

}
