package Abstraction;



public class InterfaceConcept {
	//InterfaceCar,BMWClass
	public static void main(String[] args) {
		BMWClass b=new BMWClass();
	b.start();
	b.stop();
	b.refuel();
	b.theftsafety();
	
	
	System.out.println("******");
	InterfaceCar u=new BMWClass();//dynamic polymorphism- object of child class is referred by parent interface reference variable
	u.start();
	u.stop();
	u.refuel();
	//u.theftsafety();not allowed, only overidden method can be called
	
	
	System.out.println("***********");
	//System.out.println(i);//no allowed, if u will write main method in child class directly then it is allowed
	System.out.println(BMWClass.i);//static in nature
	System.out.println(InterfaceCar.i);
	System.out.println(u.i);//warning should be accessein static way
	System.out.println(b.i);//warning should be accessein static way
	
	//BMWClass.z=60;final in nature
	System.out.println(BMWClass.z);
	
	
	//BMWClass.x=60;//final in nature
		System.out.println(BMWClass.x);
		
	
	
	
 
	//BMWClass.i=40; not allowed final in nature
	
	
	

	}

}
