
public class java_String {

	public static void main(String[] args) {
	//1.Java Strings
		//Strings are used for storing text.
        //A String variable contains a collection of characters surrounded by double quotes:
		String greeting = "Hello";
		System.out.println(greeting);
		
		
		//2.String Length
		//A String in Java is actually an object, which contain methods that can perform certain operations on strings.
		//For example, the length of a string can be found with the length() method:
		
		String Txt="ABCD";
		System.out.println(Txt.length());
		
		//3.More String Methods
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		//Finding a Character in a String
		String txt1 = "Hey Folks!";
		System.out.println(txt1.indexOf("Folks!")); // Outputs 7 
		//Java counts positions from zero.
		//0 is the first position in a string, 1 is the second, 2 is the third ...
		
		//4.Java String Concatenation
		//The + operator can be used between strings to combine them. This is called concatenation:
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		//Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
		//You can also use the concat() method to concatenate two strings:
		String firstName1 = "John ";
		String lastName1 = "Doe";
		System.out.println(firstName.concat(lastName));
		//Technical Details
		//Returns:	An int value, representing the index of the first occurrence of the character in the string, or -1 if it never occurs
		
		
		
		
	}

}
