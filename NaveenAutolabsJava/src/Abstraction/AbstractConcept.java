package Abstraction;

public class AbstractConcept {
	//Bank,hdfc
	public static void main(String[] args){
		hdfc hd=new hdfc();
		
		hd.loan();
		hd.credit();
		hd.debit();
	
		//dynamic polymorphism
		Bank b=new hdfc();
		b.loan();
		b.credit();
		b.debit();
		//b.funds();not allowed
		
		
		
		
	}

}
