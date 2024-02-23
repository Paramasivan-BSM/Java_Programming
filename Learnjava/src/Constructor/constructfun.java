package Constructor;

class A {
	
	String Shirt;
	int Price;
	
	
	A(){
		Shirt="PUMA";
		Price=300;
	}
	
	A(String ShirtT,int PriceS){
		Shirt=ShirtT;
		Price=PriceS;
	}
	
}

public class constructfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A EasyBuy=new A("AllenSolly",2000);
//EasyBuy.Shirt="Allensolly";
//EasyBuy.Price=500;


System.out.println(EasyBuy.Shirt);
System.out.println(EasyBuy.Price);
	}

}
