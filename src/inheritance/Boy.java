package inheritance;

public class Boy extends Papa{

	public Boy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Creating object and printing
		Boy boi = new Boy();
		double result1 = boi.add(12, 20);
		double result2 = boi.sub(21, 10);
		
		System.out.println("Method from GrandPa "+result2);
		System.out.println("Method from Papa "+result1);

	}

}
