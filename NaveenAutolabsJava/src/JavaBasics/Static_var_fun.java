package JavaBasics;

public class Static_var_fun {
	//object contains non static variable and non static function so we need to create object to call them remember circle diagram
	//there is separate memory for static variable and static function
	//static variable and static function can be called by directy,class name and object
	// calling static variable and static function through object is not a good practice bcoz if we can call them directly why should we create object
	 
	static int a;//static global variable
	static int A;//case sensitive//static global variable
	
	int b;//non static global variable
	public static void static_scope(){
		a=74;
		
		System.out.println(a);
		Static_var_fun stat_objec=new Static_var_fun();
		System.out.println(stat_objec.a);
		System.out.println(Static_var_fun.a);
		stat_objec.a=77;
		Static_var_fun.a=92;
		
		System.out.println(Static_var_fun.a);	
		//b=88;not allowed
		//Static_var_fun.b=89;not allowed
		
		stat_objec.b=88;
	}
	
	public void scope(){
		
		a=91;
		Static_var_fun.a=45;
		Static_var_fun ob=new Static_var_fun();
		ob.a=67;
		//Static_var_fun.b=99;
		b=11;
		System.out.println(b);
		ob.b=22;
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		
		
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Static_var_fun obj=new Static_var_fun();
		System.out.println(Static_var_fun.a);

		obj.a=34;//allowed
		System.out.println(obj.a);
		System.out.println(a);
		System.out.println(Static_var_fun.a);
		
		static_scope();
		//a=35;
	
		//Static_var_fun.a=22;
		obj.scope();
		
		
		//b=75;not allowed
		//Static_var_fun.b=44; not allowed
		
		//scope();//not allowed Cannot make a static reference to the non-static method scope() from the type Static_var_fun
		//Static_var_fun.scope();not allowed
		
		
		
		
		
		
	}

}
