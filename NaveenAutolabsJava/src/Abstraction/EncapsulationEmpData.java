package Abstraction;

public class EncapsulationEmpData {
// Encapsulation(feature of OOPS) is also called data hiding
//	Encapsulation-to hide a data member(instance/class variable), define the variable private in nature
// so that it cannot be accessed by outside the class thatswhy it is called data hiding. u can access these members through public methods
//if u will create method as private than what is the use. nothing is accessed from outside world
//	Encapsulation(data binding)	binding of fields and methods
//for security point of view we use encapsulation(data hiding)
	//encapsulation is part of object oriented programming language
	//it provides high level security
	//private variable,getter/setter should always be public
	private int ssn;
	private String empName;
	private int empage;
	
	
	public static void main(String[] args) {
		
		EncapsulationEmpData emp=new EncapsulationEmpData();
		emp.setSsn(123456);
		emp.setEmpName("tom peter");
		emp.setEmpage(35);
		
		
		System.out.println("employee name is"+emp.getEmpName());
		System.out.println("employee age is"+emp.getEmpage());
		System.out.println("employee name is"+emp.getSsn());
	}	
	
	
	
	//right click-Source-Generate Getters and Setters
	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpage() {
		return empage;
	}


	public void setEmpage(int empage) {
		this.empage = empage;
	}

}
