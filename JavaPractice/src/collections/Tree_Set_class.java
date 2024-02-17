package collections;

import java.util.TreeSet;

public class Tree_Set_class implements Comparable{
	
	String name;
	
	int age;
	
	public Tree_Set_class(String name, int age) {
		
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
		Tree_Set_class T = (Tree_Set_class)obj;
		return T.age-this.age;
	}
	
	public static void main(String[] args) {
		
		TreeSet T = new TreeSet();
		
		T.add(new Tree_Set_class("Bala",17));
		
		T.add(new Tree_Set_class("manoj",21));
		
		T.add(new Tree_Set_class("hari",12));
		
		T.add(new Tree_Set_class("Kia",43));
		
		T.add(new Tree_Set_class("Leo",31));
		
		System.out.println(T);
				
		
	}

}
