package exercise;

public class Nnew extends MyAbs{
	@Override
	int value(int a, int b) {
		
		return a+b;
	}
	

	public static void main(String[] args) {
		Nnew mi = new Nnew();
		System.out.println(mi.value(12, 2));
		

	}

	

}
