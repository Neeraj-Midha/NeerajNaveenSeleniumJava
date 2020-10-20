package JavaBasics;

public class NaveenJavaClass3Loops {

	public static void main(String[] args) {
		//instead of writing repetitive code again and again we should always use looping concept
		//While loop disadvantage- infinite loop if incremental or decremental part is missed
		int i=0;//initialization part
		while(i<=10)//conditional part
		{
			System.out.println(i);
			i++;//incremental/decremental part
		}
System.out.println("0 to 10");
		//for loop- all three parts in single line
		for(int j=0;j<=10;j++){
			System.out.println(j);
		}
		
		System.out.println("10 to 0");
		for(int j=10;j>=0;j--){
			System.out.println(j);
		}
		//10 to -10
		System.out.println("10 to -10");
		for(int j=10;j>=-10;j--){
			System.out.println(j);
		}
		
		
		
		
		
	}

}
