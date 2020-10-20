package ObjectOrientedProgPart2;

public final class FinalConcept {
	
	
	
	
	
	
	public static void main(String[] args) {
		//final keyword used to define the constant values, u cannot modify the value of final variable
		//final used to prevent inheritance if u write, public final class FinalParentClass, u cannot inherit this class to child class
		//means u cannot write public class FinalChildClass extends FinalParentClass bcoz FinalParentClass is final class
		//to prevent method overriding eg start method
		final int i=10;
		//i=20; not allowed bcoz of final
		
		System.out.println(i);
	}

}
