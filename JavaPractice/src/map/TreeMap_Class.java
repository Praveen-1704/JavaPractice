package map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Class implements Comparable{
	
	String name;
	int age;
	
	public TreeMap_Class(String name, int age) {
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
		TreeMap_Class T = (TreeMap_Class) obj;
		return this.name.compareTo(T.name);
	}
	
	public static void main(String[] args) {
		
		TreeMap T = new TreeMap();
		
		T.put(new TreeMap_Class("Hari",22),"orange");
		
		T.put(new TreeMap_Class("Manoj",19),"Apple");
		
		T.put(new TreeMap_Class("Jai",24),"Pineapple");
		
		T.put(new TreeMap_Class("Mano",29),"grapes");
		
		System.out.println(T);
		Set s = T.keySet();
		for(Object o : s)
		{
			System.out.println(o+" "+T.get(o));
		}
	}
	
	

}
