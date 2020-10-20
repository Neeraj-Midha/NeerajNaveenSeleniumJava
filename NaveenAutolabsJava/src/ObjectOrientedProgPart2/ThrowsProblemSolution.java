package ObjectOrientedProgPart2;

public class ThrowsProblemSolution {

	public static void main(String[] args) {
		ThrowsProblemSolution th1=new ThrowsProblemSolution();
		
		
		th1.sum();
		
		System.out.println("abc");

	}
	
	public void sum() { 
		try{// at last u have to use try-catch block
			
			div();
		
		}
		catch(ArithmeticException e){
			
		}
	}
	
	public void div() throws ArithmeticException{
		int i=9/0;//exception is here and it is handled by calling function(sum)
	}
	
	
	

}
