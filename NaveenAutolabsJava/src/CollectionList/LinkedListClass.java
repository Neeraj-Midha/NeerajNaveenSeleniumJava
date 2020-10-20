package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		//linked list is a special collection or dynamic array which stores the data on the basis of actual data and reference data(address of the next node)
		//remember diagram head, node(data,next), null...singly linkedlist-each and every node stores the reference of next element, does not store the reference of previous element
		
		LinkedList<String> ll=new LinkedList();
		ll.add("selenium");
		ll.add("automation");
		ll.add("QTP");
		ll.add("java");
		System.out.println(ll);
		
		ll.addFirst("neeraj");
		ll.addLast("Midha");
		System.out.println(ll);
		
		System.out.println(ll.get(0));
		ll.set(0, "Midha");
		System.out.println(ll.get(0));
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		System.out.println("********* for loop");
		
		//to print all contents of linked list
		//for loop
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		System.out.println("******Advance for loop");
		//Advance for loop
		for(String str:ll){
			System.out.println(str);
		}
		//Iterator
		System.out.println("******Iterator");
		Iterator<String> it=ll.iterator();//ll.iterator() returns refernce
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("******While loop");
		System.out.println(ll);
		int num=0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
