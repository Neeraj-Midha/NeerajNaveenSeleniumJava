package Abstraction;

public class hdfc extends Bank{

	public void loan(){//override
		System.out.println("hdfc-----own loan functionality");
	}
	
	public void funds(){
		System.out.println("hdfc----funds");
	}
	
}
