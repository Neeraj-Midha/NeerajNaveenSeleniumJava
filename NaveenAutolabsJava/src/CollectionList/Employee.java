package CollectionList;

public class Employee {
	
	
	String name;
	int age;
	String dept;
	
	Employee(String name,int age,String dept){
		
		//this keyword is used when global variable name and local variable name is sam
		this.name=name;//this.name, name is global variable name
		this.age=age;
		this.dept=dept;
		
		
	}
	

}
