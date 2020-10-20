package ObjectOrientedProgPart1;

public class NaveenClass6ClassCar {
	
	//Class is an entity where we define the characterstics(properties) in form of method and Variables
	//in car eg body of class is an object
	// new operator used to create an object and a is a object reference variable
 int model;
 int wheel;
 public static void main(String[] args){
	 
	 NaveenClass6ClassCar a=new NaveenClass6ClassCar();
	 //new NaveenClass6ClassCar()----it is an object of the class and a is refering this object 
	 //remember circle example,new NaveenClass6ClassCar() it is a circle(object) and a is the name of circle
	 
	 NaveenClass6ClassCar b=new NaveenClass6ClassCar();
	 NaveenClass6ClassCar c=new NaveenClass6ClassCar();
	 //copy of model and wheel given to each object
	 
	 a.model=2020;
	 a.wheel=4;
	 System.out.println(a.model);
	 System.out.println(a.wheel);
	 
	 b.model=2019;
	 b.wheel=5;
	 System.out.println(b.model);
	 System.out.println(b.wheel);
	 
	 c.model=2018;
	 c.wheel=6;
	 System.out.println(c.model);
	 System.out.println(c.wheel);
	 c.model=2011;//it is possible
	 System.out.println(c.model);
	 //o/p 2011
	 
	 
 }

}
