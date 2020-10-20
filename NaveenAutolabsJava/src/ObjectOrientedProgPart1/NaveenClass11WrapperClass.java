package ObjectOrientedProgPart1;

public class NaveenClass11WrapperClass {

	public static void main(String[] args) {
		String s="100";
		
		System.out.println(s+20);
		
		
		
		//String to int
		int i=Integer.parseInt(s);//Integer is a class as it is in capital letter, keywords are in small letter
		System.out.println(i+20);
		
		
		
		//NumberFormat Exception
//		String s11="ABC";
//		int i11=Integer.parseInt(s11);
//		System.out.println(i11);
		
		
		
		//String to double
		double d=Double.parseDouble(s);//Double is a class as it is in capital letter, keywords are in small letter
		System.out.println(d);
		//no method for char
		//String to boolean
		String f="true";
		boolean b=Boolean.parseBoolean(f);
		System.out.println(f);
		//int to string
		int j=200;
		System.out.println(j+20);
		String k=String.valueOf(j);
		System.out.println(k+20);//o/p 20020
		//exception
		String z="100a";
		int g=Integer.parseInt(z);//java.lang.NumberFormatException: For input string: "100a"
				
	}

}
