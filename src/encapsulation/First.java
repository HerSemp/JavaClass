package encapsulation;

public class First {
	private int a;
	private double b;
	private String Name;
	private boolean State;
	private char Ordina;

	public First() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getA() {
			return a;
		}
	
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	
	public boolean getState() {
		return State;
	}

	public void setState(boolean State) {
		this.State = State;
	}
	public char getOrdina() {
		return Ordina;
	}

	public void setOrdina(char Ordina) {
		this.Ordina = Ordina;
	}

}
