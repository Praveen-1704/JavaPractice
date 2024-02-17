package collection;

import java.util.TreeMap;

public class student implements Comparable{
	

		String name;
		int id;
		String branch;
		student(String name,int id,String branch)
		{
			this.name=name;
			this.id=id;
			this.branch=branch;
		}
		public String toString()
		{
			return name+" "+id+" "+branch;
		}
		 
		public static void main(String[] args)
		{
		TreeMap t=new TreeMap();
		t.put(new student("harshi",1,"cse"),105);
		t.put(new student("anu",5,"cse"), 101);
		t.put(new student("chandini",3,"cse"), 102);
		
//		t.put(3,"Hiii");
//		t.put(1,"hello");
//		t.put(2,"van");
		System.out.println(t);//class cast exception
		}
		
		
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			student s=(student)o;
			return this.name.compareTo(s.name);
			
		}


}
