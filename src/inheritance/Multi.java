package inheritance;

public class Multi implements Int1, Int2 {

	public Multi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Creating object and printing
		Multi mi = new Multi();
		double result1 = mi.add(12.8, 2.0);
		double result2 = mi.sub(result1,1);
		System.out.println(result1+" & "+result2);

	}

	@Override
	public double add(double a, double b) {
		
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		
		return a-b;
	}

}
