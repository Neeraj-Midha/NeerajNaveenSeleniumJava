package JavaBasics;

public class NaveenJavaClass3IncrementDecrement {

	public static void main(String[] args) {
		int i=1;
		int j=i++;//post increment
		System.out.println(i);
		System.out.println(j);
		//o/p
		//2
		//1
		System.out.println("****");
		int a=1;
		int b=++a;//pre increment
		System.out.println(a);
		System.out.println(b);
		//o/p
		//2
		//2
		System.out.println("****");
		int m=2;
		int n=m--;
		System.out.println(m);
		System.out.println(n);
		System.out.println("****");
		int p=2;
		int q=--p;
		System.out.println(p);
		System.out.println(q);

		System.out.println("****");
		int f=1;
		System.out.println(f++);
		int g=f++;//post increment
		System.out.println(f);
		System.out.println(g);
	}

}
