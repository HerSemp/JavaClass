package encapsulation;

public class Second {
	

	public Second() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		First child = new First();
		 child.setA(5);
		 child.setB(8);
		 child.setName("Hemanth");
		 child.setState(true);
		 child.setOrdina('g');
		 
	
		System.out.println(child.getA());
		System.out.println(child.getB());
		System.out.println(child.getName());
		System.out.println(child.getState());
		System.out.println(child.getOrdina());

	}

}
