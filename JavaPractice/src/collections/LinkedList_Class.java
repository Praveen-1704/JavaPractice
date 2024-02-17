package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Class implements Comparable{
	
	
	String name ;
	
	int age;
	
	public LinkedList_Class(String name,int age) {
		this.name=name;
		this.age=age;	
	}
	
	@Override
	
	public String toString()
	{
		return name+" "+age;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		LinkedList_Class L = (LinkedList_Class)obj;
		
		return this.age-L.age;
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedList L = new LinkedList();
		
		L.add(new LinkedList_Class("Manoj",22));
		
		L.add(new LinkedList_Class("Mano",32));
		
		L.add(new LinkedList_Class("Hari",17));
		
		L.add(new LinkedList_Class("kia",41));
		
		L.add(new LinkedList_Class("Sunil",21));
		
		Collections.sort(L);
		
		L.addFirst(new LinkedList_Class("Bala",40));
		
		L.addLast(new LinkedList_Class("tttii",31));
		
		
		System.out.println(L);
		
		System.out.println("==============================");
		for(Object obj:L)
		{
			System.out.println(obj);
		}
		
		
	}
	

}
