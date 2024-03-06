package Threads;


	
	
	class A extends Thread{
		public void run() {
			
			for(int i=0;i<200;i++) {
				
				System.out.println("PARAMASIVAN");
				
			}
		}
	}
		
	
	class B extends Thread{
		
		public  void run() {
			
			int i=0;
			while(i<5) {
				System.out.println("PARAMASIVAN_BSM");
				i++;
			}
			
			
			
		}
	}
	public class T1EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A o1=new A();
		B o2=new B();
		o1.start();
		o2.start();
		

	}
}



