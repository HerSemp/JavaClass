package exercise;

public class ChildAbs extends MyAbs {

	
	 int value(int x, int y) {
		
		return x+y;
	}

	public static void main(String[] args) {
		
		ChildAbs mi = new ChildAbs();
		 int result = mi.value(23,43);
		
		
		System.out.println(result);

	}




}
