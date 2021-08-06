package pkg_learning;

public class Class_44 {
	
	//Exception handling in java
	//Exception can occur at runtime (known an runtime exceptionn) as well as at compile-time (known Compile-time exception)

	/* try can have multiple catches in a code
	try{
		//statement that may cause an exception
	}
	catch (exception (type) e(object))
	{
		//error handling code
	}*/

	public static void trycatchmethod (){
		int num1, num2;
		try{
			System.out.println("Try block message");
			// Try block to handle code that may cause exception
			num1 = 0;
			num2 = 62 / num1;
		} 
		catch (ArithmeticException e) {
			//This block is to catch divide-by-zero error 
			System.out.println("Error: Don't divide a number by zero");
			System.out.println("+++++++ ");
			System.out.println("error is:" +e.toString());
			System.out .println("++++++");
		}
		catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		}
		catch (Exception e) {
			System.out .println("Warning: Some Other exception");
		}
		System.out.println("Out of try-catch block...");
	}

	

	/*Java Finally block Exception handling /
	try {
	//statements that may cause an exception
	}
	finally {
		//statements to be executed
	}*/
	public static int tryfinally() {

	try {
	return 112;
		}
	finally {
	System.out.println("This is Finally block");
	System.out.println("Finally block ran ever after return statement ");
		}
	}
	public static void trycatchfinally() {
		try {
		System.out.println("First statement of try block");
		int num = 45/0;
		System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("Finally out of try catch finally");
	}
	
	@SuppressWarnings("finally")
	public static int mytestingfunc() {
		try {
			return 5;
		}
		finally {
			return 19;
		}
	}
	public static void main(String [] args) {
		System.out.println(mytestingfunc());
		System.out.println("trycatchmethod:");
		trycatchmethod();
		System.out.println("tryfinally:");
		System.out.println(tryfinally());
		System.out.println("trycatchfinally:");
		trycatchfinally();
	}

}
