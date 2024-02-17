package variable_Shadowing;

public class Class2 extends Class1{
	
	int a=234;
	
	static int b=456;

	public static void main(String[] args) {
		
		Class1 c = new Class2();
		
		System.out.println(c.a);
		
		System.out.println(c.b);

		System.out.println("=================================");
		
		Class2 c2 =(Class2)c;
		
		System.out.println(c2.a);
		
		System.out.println(c2.b);
	}

}
