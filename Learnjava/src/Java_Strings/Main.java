package Java_Strings;

public class Main {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		
		//String Length
		/*A String in Java is actually an object, which contain methods that can perform certain operations on strings.
		 *  For example, the length of a string can be found with the length() method:*/
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		
		
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt1.toLowerCase());   // Outputs "hello world"
		
		
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate")); // Outputs 7


		
		

	}

}
