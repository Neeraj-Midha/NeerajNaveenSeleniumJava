package Abstraction;

public class BMWClass implements InterfaceCar{

	//InterfaceCar,InterfaceConcept
	
	
	
	@Override //it is not compulsary to write @Override but good practice
	
	public void start(){
		System.out.println("bmw start");
	}
	public void stop(){
		System.out.println("bmw stop");
	}
	public void refuel(){
		System.out.println("bmw refuel");
	}
	
	
	public void theftsafety(){
		System.out.println("bmw non overridden theft safety");
		
		
	}
	
	
	

}
