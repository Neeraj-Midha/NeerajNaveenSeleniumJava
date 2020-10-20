package ObjectOrientedProgPart2;

public class ThrowKeyword {

	public static void main(String[] args) {
		System.out.println("abc");
		
		try{
			 throw new Exception("Neeraj");//u can create your own(customize) exception#test and take u to catch block
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("pqr");
		
		
		String flag=" ";
		if(flag.equals(" ")){
			try {
				throw new Exception(" blank exception anything u can write her");//if u dont write in try/catch block than error comes Unhandled exception
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("xyz");
		

	}

}
