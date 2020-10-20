package JavaBasics;

public class NaveenJavaClass2StringConcatenatio {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		String x="Hello";
		String y="World";
		double c=12.33;
		double d=10.33;
		//System.out.println(a,b);not allowed
		//System.out.println(x,y);not allowed
		
		//left to right execution
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println((a+b+x+y+a+b));
		System.out.println(x+y+c+d);
		System.out.println("the value of a+b is"+a+b);
		//System.out.println("the value"a);not allowed
		System.out.print("hello world");//without a new line
		System.out.println("hello testing");

	}

}
