package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Class implements Comparable{
	
	String name;
	
	int age;
	
	int phoneNumber;
	
	public ArrayList_Class(String name,int age,int phoneNumber) {
		
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		ArrayList_Class a = (ArrayList_Class)obj;
		return this.name.compareTo(a.name);  // Sorting by name
//		return this.age-a.age;  // Sorting by age in ascending order
//		return a.age-this.age;   // Sorting by age in decending order
		
	}
	
	@Override
	public String toString()
	{
		return name+" "+age+" "+phoneNumber;
	}
	
	public static void main(String[] args) {
		
		ArrayList A = new ArrayList();
		
		A.add(new ArrayList_Class("Ravi", 21, 789067));
		
		A.add(new ArrayList_Class("Manoj",19,677676576));
		
		A.add(new ArrayList_Class("Kiran", 15,987654));
		
		A.add(new ArrayList_Class("Bala",22, 7876789));
		
		Collections.sort(A);
		
		System.out.println(A);
		
//		for(Object obj: A)
//		{
//			System.out.println(obj);
//		}
//		
		
	}

}
