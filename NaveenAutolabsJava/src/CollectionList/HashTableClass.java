package CollectionList;

import java.util.Hashtable;

public class HashTableClass {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		
		ht.put(1, "Neeraj");
		ht.put(2,"Midha");
		
		System.out.println(ht.get(2));
		
		
		ht.put("Neeraj", 1);
		System.out.println(ht.get("Neeraj"));

		Hashtable<Integer,Integer> ht1=new Hashtable<Integer,Integer>();
		
		ht1.put(1,100);
		System.out.println(ht1.get(1));
		Hashtable <Integer,String> ht2=new Hashtable<Integer,String>();
		ht2.put(2,"hashtable");
		System.out.println(ht2.get(2));
	}

}
