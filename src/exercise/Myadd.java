package exercise;

public class Myadd {

	public Myadd() {
		
	}
	public int add(int a, int b) {
		int result = 0;
		try {
			 result = a/b;
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("finally printed");
		}
		return result;
	}
	
	public static void main(String[] args) {
		Myadd ex = new Myadd();
		int result = ex.add(0, 0);
		System.out.println("Result of addition is "+result);

	}

}
