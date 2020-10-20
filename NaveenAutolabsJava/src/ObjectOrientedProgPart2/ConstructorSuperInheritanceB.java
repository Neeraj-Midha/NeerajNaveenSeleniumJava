package ObjectOrientedProgPart2;

public class ConstructorSuperInheritanceB extends CostructorSuperInheritanceA{
	//super keyword is used to call parent class constructor
		//super keyword should be the first statement in child constructor
	//super Keyword can be written only once one constructor 
	//parent class default constructor is called always whenever object is created. u can call other constructor(parameterized or default) by super keyword 
	public ConstructorSuperInheritanceB() {
		super(); //write it or not parent class default constructor will be called

		System.out.println("child class b");

	}
	public ConstructorSuperInheritanceB(int i){
		super(i);//if super with parameter is written then parent class default constructor will not be called if it is not written parent class default constructor will be called
		System.out.println("child class "+i);
	}

public ConstructorSuperInheritanceB(int i, int j){
		super(i,j);
		System.out.println("child class"+i);
		System.out.println("child class"+j);
	}

	public static void main(String[] args) {
		ConstructorSuperInheritanceB bb=new ConstructorSuperInheritanceB();
		ConstructorSuperInheritanceB B=new ConstructorSuperInheritanceB(10);
		ConstructorSuperInheritanceB Bbbb=new ConstructorSuperInheritanceB(20,30);
	}

}
