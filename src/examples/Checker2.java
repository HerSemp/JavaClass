package examples;

public class Checker2 extends StaticExamples {
	public int s = 100;
	public String b = "adfdsf";
	public Character c = 'd';
	public double d = 2.2;
	public boolean stated = false;
	public Float pol = 2.2f;

	public Checker2() {
		
	}
	int a = super.value();
	public static void main(String[] args) {
		Checker2 g = new Checker2();
		System.out.println(g.a);

	}

}
