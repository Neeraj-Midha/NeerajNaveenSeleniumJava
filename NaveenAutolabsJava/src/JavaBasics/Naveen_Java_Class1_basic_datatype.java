package JavaBasics;

public class Naveen_Java_Class1_basic_datatype {
	
	//https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html#:~:text=Instantiation%3A%20The%20new%20keyword%20is,which%20initializes%20the%20new%20object.
	
//java is programming language, open source technology, freely available in the markit, 
//developed by sunmicrosystem, later acquired by Oracle
//open source, licence free, platform independent(os(linux, window etc) independent)
//java supports selenium
//eclipse is an editor tool, to compile and execute java code,ide
//workspace-project-package(manage files in form of packages(like folder),eg all search 
//functionality files are stored in one folder and inbox functionality files are stored in 
//other folder)
//class name and project name convention:first letter should be capital of each word in a name
//extension of file is .java, main method should be there to execute
// keywords are started with small letter, java is case sensitive
//comments to describe functionnalty to new developer
	public static void main(String[] args){
		
		//primitive data type int/double/char/boolean, string not primitive data type
		int i=10;
		//int i=20; no duplicate, how can two memory boxes having same name, but u can replace 
		//value of variable
		i=20;
		int j=0;
		int k=-1;
		//int l=2.1; not allowed
		double m=2.1;
		double o=100;//allowed int can be converted to double but not double can be converted to int
		
		char p='1';
		char q='N';
		//char r='NN'; not allowed. only single digit is allowed
		
		boolean s=true;
		boolean t=false;//true/false is a keyword as well as value
		
		String u="100yg$$"; //String is a class not datatype
		
		//syso ctrl+space+enter
		System.out.println(i+m);
		
		
		
	}
	
}
