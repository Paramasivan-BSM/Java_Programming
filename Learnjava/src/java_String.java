
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
		String firstName = "Virat";
		String lastName = "Kholi";
		System.out.println(firstName + " " + lastName);
		//Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
		//You can also use the concat() method to concatenate two strings:
		String firstName1 = "ben ";
		String lastName1 = "stokes";
		System.out.println(firstName1.concat(lastName1));
		//Technical Details
		//Returns:	An int value, representing the index of the first occurrence of the character in the string, or -1 if it never occurs
		
		
		//5.Java Numbers and Strings
		//WARNING!Java uses the + operator for both addition and concatenation.Numbers are added. Strings are concatenated.
		String x = "10";
		String y = "20";
		String z = x + y;  // z will be 1020 (a String)
		System.out.println(z);
		//If you add a number and a string, the result will be a string concatenation:
		String x1 = "10";
		String y1= "20";
		String z1 = x1 + y1;  // z will be 1020 (a String)
		System.out.println(z1);
		
		//6.Strings - Special Characters
		//Because strings must be written within quotes, Java will misunderstand this string, and generate an error
		//String txt = "We are the so-called "Vikings" from the north.";
		//The solution to avoid this problem, is to use the backslash escape character.
		//The solution to avoid this problem, is to use the backslash escape character.
		
		//The sequence \"  inserts a double quote in a string:
		String txt2 = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt2);
		//String txt = "We are the so-called \"Vikings\" from the north.";
		String txt3 = "It\'s alright.";
		System.out.println(txt3);
		//The sequence \\  inserts a single backslash in a string:
		String txt4 = "The character \\ is called backslash.";
		System.out.println(txt4);
		
		//7.String charAt() Method
		//Definition and Usage
//		The charAt() method returns the character at the specified index in a string.
//		The index of the first character is 0, the second character is 1, and so on.
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		
		//8.String codePointAt()
		//The codePointAt() method returns the Unicode value of the character at the specified index in a string.
		//The index of the first character is 0, the second character is 1, and so on.
		String myStr1 = "Hello";
		int result1 = myStr1.codePointAt(0);
		System.out.println(result1);
		//Remain Methods will adds in impending months 


		
		
	}

}
