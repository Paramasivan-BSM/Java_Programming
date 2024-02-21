package InterFace;

public class child implements GrandFather,father {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		child obj = new child();
		obj.Home();
		obj.Land();
		obj.Car();
		
		
	}

	@Override
	public void Land() {
		System.out.println("100 acors Land");
		
	}

	@Override
	public void Home() {
		System.out.println("10 BHK ROOM");
		
	}

	@Override
	public void Car() {
		System.out.println("My DAD Having A BMW CAR");
		
	}

}
