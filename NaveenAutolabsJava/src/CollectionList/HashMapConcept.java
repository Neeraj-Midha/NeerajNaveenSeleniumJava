package CollectionList;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implements MapInterface
		//extends AbstractMap
		//it contains only unique elements
		//stores the values- key value pair
		//it may have one null key and multiple null values
		//it maintains no order(values not stored on index basis)
		//hashmap is non synchronized, in mutithreading multiple threads are accessing simultaneously thats why performance is high
		//hashtable is synchronized, it is threadsafe, at a time only one thread access and process hashtable
		//Fail fast condition-when one thread is removing the element and second thread is accessing it then concurrent modification exception will occur
		//in hashtable thread will lock the hashmap and second thread cannot access it untill it not released by thread one
		//to avoid failfast condition, concurrent hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2,"QTP");
		hm.put(3,"TestComplete");
		hm.put(4, "RFT");
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));//it will not give any array out of bound exception as in arraylist or arrays bcoz does not store values on the basis of indexes
		//Entry and entryset is used because values not stored on index basis
		//hm.entryset gives whole hashmap and m is refernce on it
		
		//null key and null values allowed in hashmap
		hm.put(null,"neeraj");
		hm.put(null, "midha");//only null midha will be printed no null neeraj will be printed because only one null value is allowed
		hm.put(5, null);
		hm.put(6, null);
		System.out.println("null key and null values");
		System.out.println(hm);
		
		for(Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());	
		
		}
		
		
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);//if u remove 3 it does not mean that 4 will be shifted to 3
		
		
		System.out.println("*************");
		
		
		HashMap <Integer,Employee> emp=new HashMap<Integer,Employee>();
		
		Employee e1=new Employee("Tom",25,"Admin");
		Employee e2=new Employee("Peter",26,"QA");
		Employee e3=new Employee("steve",27,"Dev");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3,e3);
		for(Entry <Integer,Employee> m:emp.entrySet()){
			int key=m.getKey();
			Employee value=m.getValue();
			System.out.println(key+value.name+value.age+ value.dept);
		}
		
		
		
		
		
		
		
		
		
	}

}
