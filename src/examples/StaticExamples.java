package examples;

public class StaticExamples {
	public static int a = 500;
	static final int z = 44;
	
	public StaticExamples() {
		
	}
	
	public static String funct() {
		String b = "Data from static";
		return b;
		
	}
	public final int value() {
		return 100;
	}

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println(z);
	}

}
