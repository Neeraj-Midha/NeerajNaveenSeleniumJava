package ObjectOrientedProgPart2;

public class ThrowsUse {

	public static void main(String[] args) throws ArithmeticException{//here exception is handled by JVM and it shows hierarchy 
		//u cannot report error through throws keyword
		//if there is very long code and there may be 100 lines which may generate exception
		//then u have to write 100 try-catch block(5 extra lines for each line-500 extra lines)
		// to avoid try catch block we use throws keyword
		
		//problems with throws keyword is u cannot report(u can not print message or logs as in catch block there)
		//at last program will be terminated and System.out.println("abc"); will not get printed
		
		ThrowsUse th=new ThrowsUse();
		
		//method chaining
		th.sum();
		
		System.out.println("abc");//this line will not get printed
		

	}
	
	public void sum() throws ArithmeticException{ //after div exception is here and it is handled by calling function main
		
			div();
		
		
	}
	
	public void div() throws ArithmeticException{
		int i=9/0;//exception is here and it is handled by calling function(sum)
	}
	
	
	

}
