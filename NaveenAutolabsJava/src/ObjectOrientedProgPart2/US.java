package ObjectOrientedProgPart2;

public interface US {

	//eg if ICICI bank want to open a branch in US, brazil and UK than ICICI bank have to follow rules(method declaration/prototype) which are declared in their interfaces
	//Multiple inheritance(many to one) is achieved by Interface in Java in eg icici(class) will follow rules defined in US(interface), brazil(interface), uk(interface)
	
	//Interface properties
	//method do not have body, only declaration(prototype)
	//variables(eg min_bal) are static by default, u dont need to write static, variables are static by default.u cannot change the value of variable means final in nature.
	//no static method in interface
	
	//interfaces are abstract in nature means we cannot create the object of interface
	// Is-A relationship between interface and class
	//has a relationship between class to class in inheritance
	//cannot create objects of interface
	int mini_bal=100;//it is static and final both by default
	public void credit();
	public void debit();
	public void transferMoney();
	
	
}
