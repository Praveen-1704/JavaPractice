package exception_with_Selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class No_Such_Element_Exception_In_java {
	
	public static void main(String[] args) {
		
		ArrayList A = new ArrayList();
		
		A.add(23);
		A.add(21);
		A.add(43);
		A.add(34);
		
		Iterator I = A.iterator();
		for(Object O:A)
		{
			System.out.println(O);
		}
		System.out.println(I.next());  // In ForEach Loop the control will goes to the first Element
		

		
		System.out.println("==========================");
		
		
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		
		System.out.println(I.next()); // In iterator (While loop) the control will no go to the first element so we are getting the No Such Element Exception
		
		
		
		
	
	}

}
