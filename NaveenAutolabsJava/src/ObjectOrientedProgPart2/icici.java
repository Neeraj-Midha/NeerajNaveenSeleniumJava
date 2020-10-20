package ObjectOrientedProgPart2;

public class icici implements US,brazil{//MULTIPLE INHERITANCE
// us says to icici that u have to follow the rules means u have to provide the features(credit, debit, transferMoney)
//but u can write your own buisiness in these methods
	public void credit(){
		System.out.println(" Interface(US) method credit");
	}
	
	public void debit(){
		System.out.println(" Interface(US) method debit");
	}
	
	public void transferMoney(){
		System.out.println(" Interface method(US) transferMoney");
	}
	
	//brazil interface method defined here
	public void mutualFunds(){
		System.out.println(" Interface(brazil) method mutualFunds");
	}
	
	//u can provide other fascilities other than that
	public void educationLoan(){
		System.out.println(" ICICI Class own method educationLoan");
	}
	
	public void carLoan()
	{
		System.out.println(" ICICI Class own method carLoan");
	}
	
}
