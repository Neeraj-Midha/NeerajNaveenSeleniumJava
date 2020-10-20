package ObjectOrientedProgPart2;

public class FinallyClass {

	public static void main(String[] args) {
		
		test();
		test2();
		division();
		div_nocatch_excep();
		
	}
	
	
		public static void test(){
			
			//u cannot write only try block, u have to write catch or finally block or both
			//finally block will be executed always whether try catch block is getting executed or not
			//finally block will always be executed
			//for good practice always write connection close with database in finally block bcoz it is always executed
			//u cannot write only try or only catch or catch-finally in a code
			try{
			System.out.println("inside test try block");
			throw new RuntimeException("test");//u can create your own(customize) exception#test and take u to catch block
			}
			
			catch(Exception e){
				
				System.out.println("inside test catch block");
				
			}
			
			finally
			{
				System.out.println("inside test finally block");
			}
			
			
		}
	
	public static void test2(){
		try{
			System.out.println("inside test2 try block");
		}
		
		finally{
			System.out.println("inside test2 finally block-finally will be executed whether exception comes or not");
		}
	}
	
	
	public static void division(){
		int i=10;
		try{
			System.out.println("inside division try block");
			int k=i/0;
		}
		
		catch(ArithmeticException e){
			System.out.println("inside division catch block");
		}
		
		finally
		{
			System.out.println("inside division finally block");
		}
		
	}
	
	
	
	public static void div_nocatch_excep(){
		int i=10;
		try{
			System.out.println("inside div_nocatch_excep try block");
			int k=i/0;
			
		}
		
		catch(NullPointerException e){//expecting ArithmeticException but written NullPointerException, check th o/p
			System.out.println("inside div_nocatch_excep catch block");
		}
		
		finally
		{
			System.out.println("inside div_nocatch_excep finally block");
		}
		
	}
	
	

}
