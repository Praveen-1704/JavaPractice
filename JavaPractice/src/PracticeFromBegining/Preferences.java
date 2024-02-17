package PracticeFromBegining;

public class Preferences {

	
	static int a=10;
	
	int b=3;
	
	
	public void m1()
	{
		
		int b=5;
		System.out.println(this.b);
	}
	
	public static void main(String[] args) {
		
		int a=4;
		
		System.out.println(Preferences.a);
		
		System.out.println("======================");
		
		Preferences p = new Preferences();
		
		p.m1();
		
	}
	
	
}
