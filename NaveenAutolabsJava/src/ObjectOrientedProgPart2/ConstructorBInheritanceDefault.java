package ObjectOrientedProgPart2;

public class ConstructorBInheritanceDefault extends ConstructorAInheritanceDefault{

	public ConstructorBInheritanceDefault(){
		System.out.println("child class constructor B");
	}
	
	public ConstructorBInheritanceDefault(int i) {
		System.out.println("child class one parameter constructor B"+i);
	}

	public static void main(String[] args) {
		ConstructorBInheritanceDefault b=new ConstructorBInheritanceDefault();//if u r writing this than there must be default constructor in Class#ConstructorBInheritanceDefault means in child class
		ConstructorBInheritanceDefault b1=new ConstructorBInheritanceDefault(50);//if u r writing this than there must be one parameter constructor in Class#ConstructorBInheritanceDefault means in child class
		//o/p
//		parent class constructor A
//		child class constructor B

		//if u will comment parent class default constructor
//		o/p
//		child class constructor B
// sequence is- control goes from ConstructorBInheritanceDefault b=new ConstructorBInheritanceDefault();
// to public ConstructorBInheritanceDefault(){ and check ithere is Super or not. in this case if not than go to
// public class ConstructorAInheritanceDefault { and print parent class constructor then System.out.println("child class constructor B");
		
//  parent class default constructor will be called always whenever object is created(ConstructorBInheritanceDefault b=new ConstructorBInheritanceDefault(); or ConstructorBInheritanceDefault b1=new ConstructorBInheritanceDefault(50);) if u write super then constructor of parent will be called acc to super condition 
		
		
	}

}
