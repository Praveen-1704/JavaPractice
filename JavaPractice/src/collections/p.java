package collections;

import java.util.ArrayList;
import java.util.Collections;

public class p {
	
	
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new A(20, "Vivek"));
		al.add(new A(70, "Praveen"));
		al.add(new A(80, "Sai"));
		al.add(new A(5, "Preetham"));
		
		Collections.sort(al);
		
		System.out.println(al);
	}
}

class A implements Comparable{
	String name;
	int a;
	A(int a, String name){
	this.a=a;
	this.name=name;
	}
	@Override
	public String toString() {
		return name+" "+a;
	}

	public int compareTo(Object o) {
		A temp = (A) o;
		return this.name.compareTo(temp.name);
	}
}
