package ObjectOrientedProgPart1;

public class NaveenClass8LocalGlobalVariable {
	String name="Neeraj";// scope of these variable overall
	int age=35;
	public static void main(String[] args) {
		//object contains nonstatic method and nonstatic variables thats we need object to call them
		int i=10;
		System.out.println("local varaible i of main "+i+" method");

		NaveenClass8LocalGlobalVariable w= new NaveenClass8LocalGlobalVariable();
		
		System.out.println(w.name);
		System.out.println(w.age);
		w.sum();
		System.out.println(i);
		System.out.println(w.age);//note if age =70; in sum() then O/p is 85, if int age=70; then o/p is 35
	}

	public void sum(){
		int i=20;
		int j=30;
		 //age=70;
		int age=70;
		System.out.println("local varaible i of sum "+i);
		System.out.println("local varaible j of sum "+j);
		System.out.println("local varaible age of sum "+age);
		age=85;
		System.out.println("local varaible age of sum updated"+age);
		
	}
}
