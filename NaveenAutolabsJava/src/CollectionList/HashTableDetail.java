package CollectionList;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableDetail {

	public static void main(String[] args) {
		//hashtable is synchronized, it is threadsafe, at a time only one thread access and process hashtable
		//in hashtable thread will lock the hashmap and second thread cannot access it untill it not released by thread one
		//hashtable stores the value on the basis of key,value pair
		//jvm assign hashcode to each object eg new emp() and if two objects are equal then it returns same hash code this means hashcode is not unique number
		//in hashtable value is associated with hashcode
		//java object is defined by 32 bit signed integer number called hashcode
		//objects are storing in hashtable in the form of key ie key->object-hashcode(<343445,"TOM") 
		//synchronized/thread safe means if thread t1 is accessing any object other threads will wait
		
		Hashtable h1=new Hashtable();
		h1.put(1,"tom");
		h1.put(2,"test");
		h1.put(3,"java");
		//creating a clone or shallow copy
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		
		//if h1 is cleared h2 remains
		h1.clear();
		System.out.println(h1);
		System.out.println(h2);
		
		//contains value
		
		Hashtable st=new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.contains("Manager")){
			System.out.println("value is found");
		}
		
		//print all values of hashtable using enumerations elements
		Enumeration e=st.elements();
		
		while (e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		
		//get all the values of hashtable using entryset
		Set s=st.entrySet();
		System.out.println(s);
		
		
		Hashtable st1=new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");
		System.out.println("only unique values");//no c, selenium twice
		System.out.println(st1);
		//no null key and null value
		//st1.put(null, "neeraj");//null pointer exception
		//st1.put("D",null);//null pointer exception
		
		
		if(st.equals(st1)){
			System.out.println("both are equal");
		}
		
		//get the value from a key
		
		System.out.println(st1.get("A"));
		
		//get the hashcode of hashtable object
		System.out.println(st1.hashCode());
		
		
		
		
	}

}
