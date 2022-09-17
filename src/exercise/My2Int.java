package exercise;

public class My2Int implements MyInt {

	public My2Int() {
		
	}

	public static void main(String[] args) {
		My2Int mi = new My2Int();
		double result = mi.div(12.5, 2.0);
		System.out.println(result);
		System.out.println(MyInt.dou);
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
