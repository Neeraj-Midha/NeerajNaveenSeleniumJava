package Abstraction;

public abstract class Bank {
	//rules of abstract class:
//	atleast one method must be abstract(only prototype/declaration) in nature
	//abstract method means method does not have body
	//abstract class can have multiple abstract method and multiple non abstract method but atleast one method must be abstract in nature
	//if there is a child class then abstract(prototype in parent class) method must be defined in it, no need to define non abstract method in child class
	// bank says to child (hdfc) that u can write your own functionality(buisiness) in definition of loan(abstract) method
	
	//abstraction means to hide implementation logic. implementation logic and featured are defined by child class
	
	//cannot create object of abstract class
	
	//partial abstraction- through abstract class we are not achieving 100% abstraction, we are achieving partial abstraction 
	//bcoz many methods(non abstract) are having body(implemntation logic) in abstract class
	//abstract class can have non static, static and final variables
	//performace wise abstract classes are fast, heap memory wise abstract classes are best bcoz not all methods are abstract seq- main method-method (short traversing). In interface main method-interface-method

	//hdfc,AbstractConcept
	
	int a=10; //non static
	
	static int b=20;// static
	
	final int f=20;//final
	
public abstract void loan();

public void credit(){
	System.out.println("bank----credit");
}

public void debit(){
System.out.println("bank----debit");
}


//can have main method but no use
//public static void main(String[] args){
//	//Bank f=new Bank();cannot instantiate
//}

}
