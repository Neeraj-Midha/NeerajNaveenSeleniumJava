package ObjectOrientedProgPart1;

public class NaveenClass12CallbyValueRefernce {
	
	int i=10;
	int j=20;

	public static void main(String[] args) {
		//in C, call by reference is achieved by pointers but in Java/;' we dont have pointers
		//how to achieve Call by reference in java, by passing object reference call by reference is possible
		int x=10;
		int y=20;
		System.out.println("before swap in calling function value of x and y is "+x+" "+y);
		NaveenClass12CallbyValueRefernce zob=new NaveenClass12CallbyValueRefernce();
		zob.swapcallbyvalue(x, y);//call by value, copy of x and y is sent to called function
		System.out.println("after swap in calling function value of x and y is "+x+" "+y);
		System.out.println("**********");
		System.out.println("before swap value of i and j"+zob.i+" "+zob.j);
		zob.swapcallbyrefernce(zob);
		System.out.println("after swap value of i and j"+zob.i+" "+zob.j);
		
	}
	
	public void swapcallbyvalue(int a, int b){
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap in called function value of a and b is"+a+" "+b);
		
	}
	
	public void swapcallbyrefernce(NaveenClass12CallbyValueRefernce yob){
		int temp;
		temp=yob.i;
		yob.i=yob.j;
		yob.j=temp;
		
		
		
		
		
		
	}
	

}
