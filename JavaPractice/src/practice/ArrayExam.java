package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayExam {

	@SuppressWarnings({ "unchecked"})
	public static void main(String[] args) {
		// A[]={1,2,3,4,5}, B[]={1,2,3,5}
		int[] a= {1,2,3,5,4},b= {1,2,3,4,5,7};
		ArrayList<Integer> l1=new ArrayList(Arrays.asList(Arrays.stream(a).boxed().toArray()));
		ArrayList<Integer> l2=new ArrayList(Arrays.asList(Arrays.stream(b).boxed().toArray()));
		ArrayList<Integer> l3=new ArrayList(l2);
		l3.forEach(x->{l1.forEach(y-> l2.remove(y));l1.remove(x);});
		l2.addAll(l1);
		System.out.println(l2);	
	}
	
}
