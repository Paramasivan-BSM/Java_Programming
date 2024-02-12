package Polymorphism;

public class MOR extends MO {
	
	
	//this method come from same class name as MO Class,this is called Method overRidding
	public void A(String N) {
		System.out.println( N + " " + "HOTEL");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOR overR=new MOR();
		overR.A("XYZ");

	}

}
