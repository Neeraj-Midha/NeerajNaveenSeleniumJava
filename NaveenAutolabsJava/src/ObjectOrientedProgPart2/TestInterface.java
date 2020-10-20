package ObjectOrientedProgPart2;

public class TestInterface {

	public static void main(String[] args) {
		icici i=new icici();
		i.credit();//overidden method as it is declared in interface(US) and defined in class()-static polymorphism-early binding(object bind with function early) 
		i.debit();//overidden method as it is declared in interface(US) and defined in class()-static polymorphism-early binding(object bind with function early)
		i.transferMoney();//overidden method as it is declared in interface(US) and defined in class()-static polymorphism-early binding(object bind with function early)
		i.mutualFunds();
		i.educationLoan();
		i.carLoan();
		
		
		System.out.println("******");
		US u=new icici();//dynamic polymorphism- object of child class is referred by parent interface reference variable
		u.credit();
		u.debit();
		u.transferMoney();
		//u.educationLoan();not allowed, only overidden method can be called
		brazil b=new icici();
		b.mutualFunds();
		
		
		System.out.println("***********");
		//System.out.println(mini_bal);no allowed
		System.out.println(icici.mini_bal);
		System.out.println(US.mini_bal);
		System.out.println(u.mini_bal);//warning should be accessein static way
		System.out.println(i.mini_bal);//warning should be accessein static way
		//US.mini_bal=200;not allowed
		
	}

}
