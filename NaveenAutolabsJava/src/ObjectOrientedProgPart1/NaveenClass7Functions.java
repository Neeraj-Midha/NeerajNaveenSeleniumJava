package ObjectOrientedProgPart1;

public class NaveenClass7Functions {

	public static void main(String[] args) {
		//function and method is same thing
		 //three type of method 1)no input no o/p 2)no input but giving some o/p 3)some input and some o/p
		NaveenClass7Functions fun=new NaveenClass7Functions();
		
		//After creating object all non static methdods are given to the object.
		//to call any non static method object reference variable is required
		//remember diagram of circle containing all non static methods
		//main method is void because it never returns any value
		
		fun.test();
		String retS=fun.qa();
		System.out.println(retS);
		int retdiv=fun.div(20,10);
		System.out.println(retdiv);
		System.out.println("*******");
		NaveenClass7Functions funfun=new NaveenClass7Functions();
		int retdivob2=funfun.div(30,10);
		System.out.println(retdivob2);
		
	}
	
	
	 public void test(){
		 System.out.println("no i/p no o/p");
	 }
	
public String qa(){
	System.out.println("no input but giving some o/p");
	String s="Selenium";
	return s;
}

public int div(int x,int y)
{
	System.out.println("some input and some o/p");
	int z=x/y;
return z;
}

}
