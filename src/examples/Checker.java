package examples;

public class Checker {
	public Checker() {
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		int a = StaticExamples.a;
		String result = StaticExamples.funct();
		int fin = StaticExamples.z;
		fin +=5;
		//StaticExamples.z += 5;
		System.out.println(fin);
	}

}
