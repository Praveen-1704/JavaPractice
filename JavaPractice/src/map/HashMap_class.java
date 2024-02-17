package map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_class {
	
	String name;
	
	int age;
	
	
	public HashMap_class(String name,int age) {
		
		this.name=name;
		this.age=age;
	}
	
	
	@Override
	public String toString()
	{
		return name+" "+age;
	}
	
	
	public static void main(String[] args) {
		
		HashMap H = new HashMap();
		
		H.put(new HashMap_class("Hari",21),"Mango");
		
		H.put(new HashMap_class("Mano",19),"Apple");
		
		H.put(new HashMap_class("bala",23), "Papaya");
		
		H.put(new HashMap_class("kia",22),"Pineapple");
		
		H.put(new HashMap_class("bail", 34),"Orange");
		
		System.out.println(H);
		
		Set s= H.keySet();
		for(Object h : s)
		{
			System.out.println(h +" "+H.get(h));
		}
	}

}


