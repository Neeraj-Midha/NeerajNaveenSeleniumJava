package ObjectOrientedProgPart1;

public class NaveenClass10StaticNonstatic {
//scope of global variable across all the function 
	String name="neeraj";//nonstatic global variable
	static int age=25;//static global variable
	
	public static void main(String[] args) {
		//there is separate memory for static variable and static function
		//static variable and static function can be called by directy,class name and object
		// calling static variable and static function through object is not a good practice bcoz if we can call them directly why should we create object
		 
		sum();
		NaveenClass10StaticNonstatic.sum();
		System.out.println(age);
		System.out.println(NaveenClass10StaticNonstatic.age);
		NaveenClass10StaticNonstatic z=new NaveenClass10StaticNonstatic();
		z.send_mail();
		System.out.println(z.name);
		z.sum();//possible but warning ie call in static way
		
		System.out.println(z.age);
	}
	public void send_mail(){
		System.out.println("non static method");
	}
	
	public static void sum(){
		System.out.println("static sum method");
	}

}
