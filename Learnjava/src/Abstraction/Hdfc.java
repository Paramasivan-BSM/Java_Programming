package Abstraction;





public class Hdfc extends RBI {
	
	public  void HomeLoan() {
		System.out.println("HomeLoan intrest 20%");
		
	}


	public void IndividuaLoan() {
		System.out.println("Individual Loan 30%");
		
	}

	
	public void EduLoan() {
		System.out.println("EDU LOAN 2%");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hdfc hdfc=new Hdfc();
		
		hdfc.EduLoan();
		hdfc.HomeLoan();
		hdfc.IndividuaLoan();
		hdfc.circuler();
		
	
	}

}
