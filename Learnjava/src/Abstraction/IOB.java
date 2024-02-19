package Abstraction;

public class IOB extends RBI {
	
	public void HomeLoan() {
		System.out.println("HomeLoan Intrest 20%");
		
	}
	
	public void IndividuaLoan() {
		System.out.println("HomeLoan Intrest 10%");
		
	}

	public void EduLoan() {
		System.out.println("HomeLoan Intrest 1%");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IOB iob=new IOB();
		iob.circuler();
		iob.EduLoan();
		iob.HomeLoan();
		iob.IndividuaLoan();
		

	}

}
