package Questions;

public class NullConcept {

	static String str;//default class
	static Object obj;//Object class
	static NullConcept nc;//Custom class
	static int i;
	public static void main(String[] args) {
		//1.case sensitive
		//Object obj=Null; not allowed
		Object obj=null;
		
		//2by default value of all reference variable is null
		System.out.println(str);
		System.out.println(obj);
		System.out.println(nc);
		
		System.out.println(i);//o/p 0 bcoz int is data type
		
		//3.Integer is a class and int is a primitive datatype, when will run below exception will be thrown 
	//	Integer i=null;
		//int j=i; not allowed
		
		//4.instanceof
		Integer k=null;
		Integer l=10;
		System.out.println( k instanceof Integer);//o/p false, k pointing to null
		System.out.println( l instanceof Integer);//o/p true
		
		//5static vs non static
		NullConcept ob=null;
		//ob.send(); null pointer exception
		ob.sum();//allowed bcoz static method does not take space in object in heap, it takes space separately in stack
		
		//6.
		System.out.println(null==null);//o/p true
		System.out.println(null!=null);//o/p false
		
		
		//7.
		String str=null;
		Integer i=null;
		Double d=null;
		//int i=null;not allowed
		System.out.println(str+"123");
		
		String s1=(String) null;
		System.out.println(s1+"123");//null can be concatenated but below operations cannot be performed
		//System.out.println(s1.length());null pointer exception
		//System.out.println(s1.charAt(0));null pointer exception
		
		Integer i1=(Integer) null;
		Double d1=(Double)null;
		System.out.println(i1);
		
	}
	
	public static void sum(){
		System.out.println("sum.......");
	}
	
	public void send(){
		System.out.println("send.......");
	}
	
	
	
	
	

}
