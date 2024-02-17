package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {
	
	
	public static void main(String[] args) {
		
		
	
	LinkedHashSet L = new LinkedHashSet();
	
	L.add(20);
	
	L.add("Mani");
	
	L.add(34);
	
	L.add(20);
	
	System.out.println(L);
	
	for(Object o:L)
	{
		System.out.println(o);
	}
	
	System.out.println("====================");
	
	Iterator I = L.iterator();
	
	
	while(I.hasNext())
	{
		System.out.println(I.next());
	}
	}

}
