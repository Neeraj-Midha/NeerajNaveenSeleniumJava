package ObjectOrientedProgPart2;

public class ConstructorDefault {

//	public ConstructorDefault(){//default constructor(zero parameter). u can write or not there is always a hidden constructor in a class but u can write it manually, compiler does not generate a constructor
//		System.out.println("Default Constructor");
//	}
//	
//	public ConstructorDefault(int i){
//		System.out.println("single parametr constructor");
//		System.out.println("the value of i"+i);
//	}
//	
//	public ConstructorDefault(int i,int j){
//		System.out.println("two parametr constructor");
//		System.out.println("the value of i"+i);
//		System.out.println("the value of j"+j);
//	}
	
	public static void main(String[] args) {
//		if u comment all the constructor manually there will be error in one or two parameter constructor calling as below but not in default constructor
		ConstructorDefault c=new ConstructorDefault();//default constructor will be called
	//	ConstructorDefault c1=new ConstructorDefault(10);
	//	ConstructorDefault c2=new ConstructorDefault(10,20);
	}
}
