package inheritance;

public class Aunty extends GrandPa{

	public Aunty() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Creating object and printing
		Aunty aunt = new Aunty();
		double result = aunt.sub(1.5, 0.3);
		System.out.println("Method from GrandPa "+result);

	}

}
