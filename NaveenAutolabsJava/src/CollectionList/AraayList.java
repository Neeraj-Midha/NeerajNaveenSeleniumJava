package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Iterator;
public class AraayList {

	public static void main(String[] args) {
		//Arraylist is a dynamic array, static array problem is size is fixed if try to achieve fourth or fifth value(System.out.println(a[3]);(4th value bcoz index starts from zero)) it gives array index out of bound exception
		//to resolve static array issue we use dynamic array(AraayList)
		
		int a[]=new int[3];//static array
		//properties of arraylist:
		//u can also add duplicate values
		//it maintain insertion order means first value at 0, 2nd value at 1, 3rd at 2nd position
		//it is not synchronized, not thread safe with respect to multithreading concept
		//arraylist is slow as compare to other collection
		//it allows random access to fetch any element bcoz it stores the values on the basis of indexes 
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		//in future u can add more items not available in static array
		
		ar.add(10);//u can also add duplicate values
		ar.add("Neeraj");
		ar.add("midha");
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		//to print all the values of array or arraylist we have to use for loop or iterator bcoz values are stored in indexes
		System.out.println("********");
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
		//non generic vs generics, before jdk 1.5 generic word is not available
		//with generics we can store data of particular type above ar is object of non generic
		//bcoz it can store data of any type(int, double, char, boolean and String)
		//to remove above warnings we use generics
		System.out.println("*******");
		ArrayList <Integer> ar1= new ArrayList <Integer>();//in generics, we can store primitive datatype(Integer) only in ArrayList if we write <Integer>
		
		ar1.add(100);
		System.out.println(ar1.get(0));
		//ar1.add("neeraj"); not allowed
		
		ArrayList <String> ar2= new ArrayList<String>();
		ar2.add("Neeraj");//in generics, we can store Nonprimitive datatype(Integer) only in ArrayList if we write <String>. String is non Primitive datatype
		//System.out.println(ar2.get(1)); exception out of bound
		
		//ArrayList <E> ar3=new ArrayList<E>();
		
		
		
		Employee e1=new Employee("Neeraj", 35, "sw");
		Employee e2=new Employee("Midha", 34, "it");
		Employee e3=new Employee("abc", 35, "engg");
		
		// below is the use of generics, bcoz u have to restrict that it should store only objects of employee class not other
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e1);//in generics, we can store objects only in ArrayList if we write <Employee>
		ar3.add(e2);
		ar3.add(e3);
		//Iterator to traverse the values
		Iterator<Employee> it=ar3.iterator();//remember the diagram
		while(it.hasNext()){
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		System.out.println("**********");
		
		
		//addAll
		

		ArrayList <String> ar4= new ArrayList<String>();
		ar4.add("Neeraj");
		ar4.add("Neeraj");
		ar4.add("Neeraj");
		

		ArrayList <String> ar5= new ArrayList<String>();
		ar5.add("Midha");
		ar5.add("Midha");
		ar5.add("Midha");
		
		
		ar4.addAll(ar5);
		
		
		for(int i=0;i<ar4.size();i++){
			System.out.println(ar4.get(i));
		}
		
		System.out.println("*******");
		
		//removeAll
		ar4.removeAll(ar5);
		for(int i=0;i<ar4.size();i++){
			System.out.println(ar4.get(i));
		}
		System.out.println("**********");
		//retainAll common value(intersection)
		
		ar4.add("Midha");
		
		ar4.retainAll(ar5);
		for(int i=0;i<ar4.size();i++){
			System.out.println(ar4.get(i));
		}
		
		
		
		
		
		
		
		
	}

}
