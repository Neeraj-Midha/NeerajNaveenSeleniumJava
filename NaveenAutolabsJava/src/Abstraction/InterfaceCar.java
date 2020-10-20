package Abstraction;

public interface InterfaceCar {

	////BMWClass,InterfaceConcept
	
	//Interface can only have abstract methods(only prototypes).
	//Interface methods are by default abstract not need to write abstract keyword
	//100% abstraction achieved by Interface (only prototypes-hides 100% implementation logic). abstract class achieves partial abstraction.
	//cannot create objects of interface
	//no static method in interface
	//variable of interface is static and final both
	//multiple inheritance can be done
	int i=10;//it is static and final both by default
	
	final static int z=40;
	
	static final int x=20;
	
	
	public void start();
	public void stop();
	public void refuel();
	
	//can have main method but no use
	//public static void main(String[] args){
//		//InterfaceCar f=new InterfaceCar();cannot instantiate
	//}

	
}
