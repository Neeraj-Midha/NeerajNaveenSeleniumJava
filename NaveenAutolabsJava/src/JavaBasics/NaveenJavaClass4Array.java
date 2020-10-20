package JavaBasics;

public class NaveenJavaClass4Array {
	public static void main(String[] args){
		int i=20;
		i=10;
		System.out.println(i);
		System.out.println("********");
		//to store similar datatype values in a array variable
		//advantages-we can store multiple values with similar datatypes in single variable
		//disadvantage-static array-size is fixed- hotel example-if there is 100 hotels,
		//u can declare size of 100 but what if u want to store 101 th hotel- ArrayIndexOutOfBoundsException
		// to over come above problem we use collection i.e arraylist, hashtable ie dynamic array
		//can not store dissimilar datatypes-to overcome this problem we use object array
		int j[]=new int[4];//j[0],j[1],j[2],j[3]
		//lowest bound or index=0
		//upper bound= n-1 where n is size of array
		j[0]=10;
		j[1]=20;
		j[2]=30;
		j[3]=40;
		System.out.println(j[3]);
	//	System.out.println(j[4]);//ArrayIndexOutOfBoundsException
		System.out.println(j.length);
		
		System.out.println("to print all values of array");
		for(int k=0;k<j.length;k++){        //length is a method
			System.out.println(j[k]);
		}
		
		double d[]=new double[2];
		d[0]=10.67;
		d[1]=66.66;
		//d[2]=77.88;//ArrayIndexOutOfBoundsException
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		char c[]=new char[2];
		c[0]='a';
		c[1]='7';
		
		String s[]=new String[2];
		s[0]="soft";
		s[1]="hard";
		
		//Object is a Super class, used to store dissimilar datatypes in a single array variable
		System.out.println("object array");
		Object ob[]=new Object[3];
		ob[0]=4;
		ob[1]='*';
		ob[2]="11/07/2020";
		for(int k=0;k<ob.length;k++){
			System.out.println(ob[k]);
		}
			
		
		
		
		
		
	}
}
