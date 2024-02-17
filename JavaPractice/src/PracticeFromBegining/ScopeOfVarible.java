package PracticeFromBegining;

public class ScopeOfVarible {
	
	static int a;
	
	static int age =10;
	
	public void m1()
	{
		int a2=10;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(age);
		
		
	}

}
