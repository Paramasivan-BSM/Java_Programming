
public class Java_Conditional_Statements_4 {

	public static void main(String[] args) {
		/*Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.*/
		
		//1. if Statement
		// Use the if statement to specify a block of Java code to be executed if a condition is true.
		//Syntax
		/*
		 * if (condition) {
  // block of code to be executed if the condition is true
   * Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.
}*/
		if (20 > 18) {
			  System.out.println("20 is greater than 18");
			}
		//We can also test variables:
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
		
		
		//2.if else Statement
		//Use the else statement to specify a block of code to be executed if the condition is false.
		//Syntax
		/*
		 * if (condition) {
       // block of code to be executed if the condition is true
       } else {
       // block of code to be executed if the condition is false
       }*/
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
		//if else if Statement
		//Use the else if statement to specify a new condition if the first condition is false.
		//Syntax
		/*
		 * if (condition1) {
         // block of code to be executed if condition1 is true
        } else if (condition2) {
        // block of code to be executed if the condition1 is false and condition2 is true
        } else {
        // block of code to be executed if the condition1 is false and condition2 is false
        }*/
		int time1 = 22;
		if (time1 < 10) {
		  System.out.println("Good morning.");
		} else if (time1 < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
		//Ternary Operator(Short Hand If...Else)
		//syntax=> variable = (condition) ? expressionTrue :  expressionFalse;
		int time2 = 20;
		String result = (time2 < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
		//Switch Statements
		//Instead of writing many if..else statements, you can use the switch statement.
		//The switch statement selects one of many code blocks to be executed:
		/*
		 * Syntax
		 * switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}*/
		
		/*
		 * The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional*/
		
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		// Outputs "Thursday" (day 4)
		
		//The break Keyword
//		When Java reaches a break keyword, it breaks out of the switch block.
//
//		This will stop the execution of more code and case testing inside the block.
//
//		When a match is found, and the job is done, it's time for a break. There is no need for more testing.
//		A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.
		
		// default Keyword
		//The default keyword specifies some code to run if there is no case match:
		int day1 = 4;
		switch (day1) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		// Outputs "Looking forward to the Weekend"
		//Note that if the default statement is used as the last statement in a switch block, it does not need a break.
		
		
		

	}

}
