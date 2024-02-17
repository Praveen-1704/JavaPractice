package PracticeFromBegining;

public class Normal_Class_For_Members {
	
	

	
	public static void main(String[] args) {
		
		String s1 = StaticMembers.s1;
		
		System.out.println(s1);
		
		StaticMembers.m1();
		
		
		System.out.println("===============================");
		
		Non_Static n = new Non_Static();
		
		System.out.println(n.a);
		
		n.m1();
		
		
	}

}
