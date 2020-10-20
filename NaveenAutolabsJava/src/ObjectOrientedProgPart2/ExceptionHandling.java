package ObjectOrientedProgPart2;

public class ExceptionHandling {

	int a=10;
	static ExceptionHandling obj3;
	public static void main(String[] args) {
		//any unwanted behaviour of code results to termination of program
		//to avoid termination of code by unpredictable behaviour of code
		//exception is code problem
		
		//uncaught exception-it is not known to eclipse that here is exception or not, u will know about the exception at runtime
		//there is no hint or suggestion by eclipse that here is exception while writing a code
		//int i=9/0;
		//System.out.println(i); o/p arithmetic exception
		
		//caught exception- eclipse shows error when writing code 
		//Thread.sleep(2000);//Unhandled exception type InterruptedException- eclipse shows error when writing this line
		
		//Error class and Exception class(arithmetic exception,null pointer exception,array index out of bound exception is achild of Exception class) is a child of Throwable class
		//Throwable class is a child of object class
		//error is syntax error, fatal error(is an error that causes a program to terminate without any warning or saving its state, aborts the application currently running
		//and may cause the user to lose any unsaved changes made in the program, it is happened when application tries to access invalid data or code or an infinity condition is met
		//OS keeps a log of the information related to error, this error halts the compilation but non-fatal error not halts the compilation), memory leakage, memory full
		
		//exception- some unwanted/unpredicatable behaviour of the code where exception is coming like(arithmetic exception,null pointer exception,array index out of bound exception)thats code problem
		
		ExceptionHandling obj=null;
		System.out.println(obj); //o/p null
		
		ExceptionHandling obj1=new ExceptionHandling();
		obj1=null;
		System.out.println(obj1); //o/p null
		
		
		//null pointer exception- when object is not created
//	example	write ExceptionHandling obj3; globally
//		and write System.out.println(obj3.a); 
//		or object reference is null 
		
		//System.out.println(obj3.a);
		
//		ExceptionHandling obj2=new ExceptionHandling();
//		obj2=null;
//		System.out.println(obj2.a); //o/p java.lang.NullPointerException
		
		
		
		//try-the code which will give(throw) an exception, will be written in try block
		//u cannot write only try block, u have to write catch or finally block or both
		//finally block will be executed always whether try catch block is getting executed or not
		//finally block will always be executed
		//for good practice always write connection close with database in finally block bcoz it is always executed
		//u cannot write only try or only catch or catch-finally in a code
		// try-catch is used to report at which place(line) error is coming, u can write code of taking screenshot of error or logs printing in catch block or u can write ur own message
		
		try{
			int i=9/0; //this code will throw an exception
		}
		catch(ArithmeticException e){
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}
	//	if u will not write int i=9/0 program will be terminated and gives arithmatic exception at line no 47 and the statement below System.out.println("ABC"); will not get executed
		
		//or u can also write below if u dont know about which type of exception can come but priority is given to child class
		
		catch(Exception e){
		System.out.println("in catch Exception class");	
		}
		
		//or u can also write below if u dont know about which type of error can come
catch(Error e){
	System.out.println("in catch Error class");
		}
		
		//or u can also write below if u dont know about which type of exception or error can come
		catch(Throwable e){
			System.out.println("in catch Throwable class");
		}
		
	
		
		System.out.println("ABC");
		
	
		
	}

}
