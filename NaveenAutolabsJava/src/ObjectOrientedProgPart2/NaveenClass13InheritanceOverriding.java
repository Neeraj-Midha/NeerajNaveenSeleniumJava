package ObjectOrientedProgPart2;

public class NaveenClass13InheritanceOverriding {

	public static void main(String[] args) {
		//a child(sub class) can inherit some properties(methods) from parents(Super/parent class) but a parent cannot inherit properties
		//from child, a parent can have multiple childs but child cannot have multiple parents
		//a child class can have only one parent class. child class extends the properties of parents class
		//eg parent have 3 methods and child have 3 own methods then child contains 6 methods
		//Method Overriding-when same method is available in parent class and child class with a same name and same no. of arguements
		//prefernce will be given to overridden method(child class method) when we are calling
		//eg of Inheritance Vehicle->Car->BMW(can inherit methods of Vehicle and Car Class),Honda etc
		//static polymorphism or Compile time polymorphism
		BMW b=new BMW();//u can create object here bcoz BMW is public ie public class BMW
		b.start(); //method overriding, as start() method of Car class and BMW has its own start() method, but when we call start() method(overridden method) of BMW is called and it is known at compile time which start() method to bind
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		System.out.println("***********");
		
		Car c=new Car();
		//can not call child class method
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//c.theftsafety(); not allowed
		
		System.out.println("************");
		
		
		//Dynamic or Run Time Polymorphism(can call only overridden method or parent class method will be called)
		//top casting
		Car C1=new BMW();//top casting-Dynamic or Run Time Polymorphism if a child class object is referred by parent class refernce variable
		C1.start();//child class method(overidden) will be called
		C1.stop();
		C1.refuel();
		C1.engine();
		//C1.theftsafety();not allowed
		
		//BMW B1=new Car();down casting is not allowed-if a parent class object is referred by child class refernce variable
		BMW B1=(BMW)new Car();//Down Casting is allowed by writing (BMW)(means we are casting parent class object to child class)only at compile time, at run time it throws exception
		//java.lang.ClassCastException: ObjectOrientedProgPart2.Car cannot be cast to ObjectOrientedProgPart2.BMW
		//at ObjectOrientedProgPart2.NaveenClass13InheritanceOverriding.main(NaveenClass13InheritanceOverriding.java:39)
		
		
		
		
	}

}
