package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Class {
	
	public static void main(String[] args) {
		
		HashSet H = new HashSet();	
		
		H.add(109);
		
		H.add(34);
		
		H.add(21);
		
		H.add(34);
		
		H.add(32);
		
		ArrayList A = new ArrayList(H);
		
		System.out.println(H);
		
		Collections.sort(A);
		
		System.out.println(A);
		
		System.out.println("===============================================");
		
		for(Object o:H)
		{
			System.out.println(o);
		}
		
		System.out.println("==============================");
		
		Iterator I = H.iterator();
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		
		

		
	
	}

}
