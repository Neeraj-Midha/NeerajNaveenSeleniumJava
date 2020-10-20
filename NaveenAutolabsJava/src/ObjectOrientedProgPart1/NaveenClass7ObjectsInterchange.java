package ObjectOrientedProgPart1;

public class NaveenClass7ObjectsInterchange {

	public static void main(String[] args) {
		 NaveenClass6ClassCar a=new NaveenClass6ClassCar();
		 NaveenClass6ClassCar b=new NaveenClass6ClassCar();
		 NaveenClass6ClassCar c=new NaveenClass6ClassCar();
		 
		 a.model=2020;
		 a.wheel=4;
		 System.out.println(a.model);
		 System.out.println(a.wheel);
		 
		 b.model=2019;
		 b.wheel=5;
		 System.out.println(b.model);
		 System.out.println(b.wheel);
		 
		 c.model=2018;
		 c.wheel=6;
		 System.out.println(c.model);
		 System.out.println(c.wheel);
		 
		 System.out.println("after interchange object references");
		 
		 //remember example of three circles
		 a=b;
		 b=c;
		 c=a;
		 System.out.println(a.model);
		 System.out.println(b.model);
		 System.out.println(c.model);
		 //o/p
		 //2019
		 //2018
		 //2019
		 
		  
		 
		 
	}

}
