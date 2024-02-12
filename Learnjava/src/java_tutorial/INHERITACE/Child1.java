package java_tutorial.INHERITACE;

public class Child1 extends Parant_DAD {

	public static void main(String[] args) {
		// now i trying to access Parant_DAD's method into Child1 class(This Mechanism called as single level inheritance)
		
		Child1 C1=new Child1();
		
		
		C1.Hotel();//This Method come from Parant_DAD Class
		C1.Grandfa_Assets();// This Method Come From GrandParant_GrandFathar Class.
		//This class extends only Parant_DAD class, Now we can Access its Behaviours through object (This Mechanism Called as Multilevel Inheritance) 
		//For Instance (A->B->->C)
	}

}
