package inheritance;

public class Uncle extends GrandPa{

	public Uncle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Creating object and printing
		Uncle unc = new Uncle();
		double result = unc.sub(1.2, 0.3);
		System.out.println("Method from GrandPa "+result);

	}

}
