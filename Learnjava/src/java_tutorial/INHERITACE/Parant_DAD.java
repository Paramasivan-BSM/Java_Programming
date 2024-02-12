package java_tutorial.INHERITACE;

public class Parant_DAD extends GrandParant_GrandFathar {
	
	
	public void Hotel() {
		
		System.out.println("ABC Hotel");
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		GrandParant_GrandFathar G1=new GrandParant_GrandFathar();
		G1.Grandfa_Assets();
	}

}

//some facts About Java inheritance
//1.single level inheritance (it supported by Java)(Parant -> child)
//2.multi level inheritance (it supported by java) (grandparant -> parant -> child1-> child2)
//3.hierarchical inheritance(its supported by java) ( child1 -> parant <-child 2 )
//4.multiple inheritance (its not supported by java but this way of ineritance possisible by other programming language)
//5.hybrid inheritance(also its not supported by java but this way of ineritance possisible by other programming language)


