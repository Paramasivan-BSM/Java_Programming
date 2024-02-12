package Polymorphism;

public class MO {
	
	public void A() {
		System.out.println("ABC HOTEL");
	}
	public void A(String N) {
		System.out.println( N + " " + "HOTEL");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MO obj=new MO();
		obj.A("AAA");
		obj.A();

	}

}
