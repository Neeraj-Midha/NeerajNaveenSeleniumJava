package ObjectOrientedProgPart2;

public class ConstructorConcept {
//Constructor is not a function, cannot return any value,no static, same name as class name
	//constructor is a class entity is used to define the features in the form of global variables while creating object
//	https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html#:~:text=Instantiation%3A%20The%20new%20keyword%20is,which%20initializes%20the%20new%20object.
	// int a=10 means 10 of type int and a is its refernce
	//class is a blueprint and object is an instance of the class. a class provides the blueprint for objects; you create an object from a class
	// ConstructorConcept c=new ConstructorConcept(); instantiating a class means The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the object constructor.  
//The phrase "instantiating a class" means the same thing as "creating an object." When you create an object, you are creating an "instance" of a class, therefore "instantiating" a class.
//remember eg int height = new Rectangle().height;
//A Java constructor is special method that is called when an object is instantiated. In other words, when you use the new keyword. The purpose of a Java constructor is to initializes the newly created object before it is used
// Typically, the constructor initializes the fields of the object that need initialization
//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
	
	//constructor overloading
	
	//the moment u create an object, constructor will be called.non static method can be called by object reference
	public ConstructorConcept(){//default constructor(zero parameter). there is always a hidden constructor in a class , compiler does not generate a constructor
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("single parametr constructor");
		System.out.println("the value of i"+i);
	}
	
	public ConstructorConcept(int i,int j){
		System.out.println("two parametr constructor");
		System.out.println("the value of i"+i);
		System.out.println("the value of j"+j);
	}
	
	public static void main(String[] args) {
		ConstructorConcept c=new ConstructorConcept();//default constructor will be called
		ConstructorConcept c1=new ConstructorConcept(10);
		ConstructorConcept c2=new ConstructorConcept(10,20);
	}

}
