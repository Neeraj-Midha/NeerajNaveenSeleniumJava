package ObjectOrientedProgPart1;

public class NaveenClass9FunctionOverloading {
	
	//when the method name is same with different arguements or input parameters
	// means differnce of datatype or no. of arguement
	//main method can be overloaded
	//method definition inside a method not allowed
	//duplicate method not aloud
	
	
	
	public static void main(String[] args) {
		
		NaveenClass9FunctionOverloading x=new NaveenClass9FunctionOverloading();
		
		x.sum();
		x.sum(10);
		x.sum("neeraj");
		x.sum('f');// it will call sum(int i)
		x.sum(10,20);
		System.out.println("in first main method");
		//	main(){
		
		//}NOT ALOUD
		
		main();
		
//main(10);//not aloud
		x.main(50);
		
	
	}
	
	public static void main(){
		System.out.println("in called main method");
	}
	
//public void main(){
		
	//}not aloud
	
	public void main(int p){
	System.out.println("main "+p);	
	}
	public void sum(){
		System.out.println("no parameter");
		
		//public void test method(){
			
		//}method definition inside a method not allowed
		
	}
	
	public void sum(int i){
		System.out.println("one int parameter"+i);
	}
	
	public void sum(String i){
		System.out.println("one String parameter"+i);
	}
	
	public void sum(int i, int j){
		System.out.print("two parameter");
		System.out.println(i+j);
	}
	
	

}
