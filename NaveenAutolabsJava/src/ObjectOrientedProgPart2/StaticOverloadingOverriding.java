package ObjectOrientedProgPart2;

public class StaticOverloadingOverriding {

	//static method can be overloaded but not Overridden
	//static main method can be overloaded 
	//Method hiding-when their is same start method in parent and child class then always child class strt method is called
//when creating object of child class. and start method of parent class is never called it is called method hiding
	
	public static void main(String[] args) {
		
		start();
		start(10);
		start(10,20);
		main();
		main(10);
	}

	public static void start(){
		System.out.println("start ");
	}
	
	public static void start(int i){
		System.out.println("start "+i);
	}
	
	
	public static void start(int i, int j){
		System.out.println("start "+i);
		System.out.println("start "+j);
	}
	
	public static void main(){
		System.out.println("static main method can be overloaded");
	}
	
	public static void main(int i){
		System.out.println("static main method can be overloaded" +i);
	}
}
