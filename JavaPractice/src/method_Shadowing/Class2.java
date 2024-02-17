package method_Shadowing;

public class Class2 extends Class1{
	
	public static void m1()
	{
		System.out.println("Helooooooooooooo");
	}
	
	public static void main(String[] args) {
		
		Class1  c = new Class2();
		
		c.m1();
		
		System.out.println("==================");
		
		Class2 c2 = (Class2)c;
		
		c2.m1();
		
	
	}

}
