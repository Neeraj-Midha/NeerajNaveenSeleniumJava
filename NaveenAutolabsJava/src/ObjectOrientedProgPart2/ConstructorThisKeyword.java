package ObjectOrientedProgPart2;

public class ConstructorThisKeyword {
String name;
int age;

public ConstructorThisKeyword(String name, int age){
	// whenever u want to initialize your global(class) variable with the current value of constructor in that case u have to use this keyword
	this.name=name;
	this.age=age;
	System.out.println(name);
	System.out.println(age);
}

	public static void main(String[] args) {
		
		ConstructorThisKeyword c=new ConstructorThisKeyword("tom",35);
		
	}

}
