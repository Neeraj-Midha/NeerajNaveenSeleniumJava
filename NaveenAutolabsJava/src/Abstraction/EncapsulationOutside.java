package Abstraction;

public class EncapsulationOutside {

	public static void main(String[] args) {
		EncapsulationEmpData e=new EncapsulationEmpData();
		e.setEmpage(30);
		System.out.println("emp age is "+e.getEmpage());
//e.empage;not allowed
		
	}

}
