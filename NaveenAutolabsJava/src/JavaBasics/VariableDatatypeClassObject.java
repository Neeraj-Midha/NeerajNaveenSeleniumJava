
package JavaBasics;

public class VariableDatatypeClassObject {
	//object contains nonstatic method and nonstatic variables thats we need object to call them
	//int x;allowed
	//x=40;not allowed
	int r;
		int a;//global variable
	int b=40;//global variable
	//VariableDatatypeClassObject objec=new VariableDatatypeClassObject();exception java.lang.StackOverflowError
	
	
	//objec.a=100; not allowed
//	System.out.println(objec.b);not allowed
	//objec.msg();not allowed
	public void msg(){
		System.out.println(b);
		System.out.println(r);
		System.out.println(r=90);
		b=70;
		a=100;
		System.out.println(b);
	
		System.out.println(a);
		//System.out.println(objec.b);not allowed
	//	System.out.println(obj.b);not allowed
		VariableDatatypeClassObject obz=new VariableDatatypeClassObject();
		System.out.println(obz.b);
		obz.chk();
	//	System.out.println(obz.t);not allowed
		System.out.println(obz.b);
		obz.b=107;
		System.out.println(obz.b);
		System.out.println(b);
		//obj.b=105; not allowed
		
	}
	
	public void chk(){
		
		System.out.println("hi");
		//obz.msg();not allowed
		
		b=95;
		
		//System.out.println(obz.b); not allowed
		//or
		//Object obz; not allowed
		//System.out.println(obz.b);not allowed
	}
	
	public static void stat_chk(){
		System.out.println("stat_chk");
		
		int t=10;
	}
	
	public static void main(String[] args) {
		
//a=40; can not make a static reference to non static field
		
	int b=50;
		System.out.println(b);
		b=80;//b can be intialized without object bcoz u declared it here as local above
		System.out.println(b);
		VariableDatatypeClassObject obj=new VariableDatatypeClassObject();
		
		System.out.println(obj.b);
		obj.b=65;
		System.out.println(obj.b);
		obj.msg();
		System.out.println(obj.b);
		
	System.out.println(obj.r);
	
		
	}
	
		
	

}
