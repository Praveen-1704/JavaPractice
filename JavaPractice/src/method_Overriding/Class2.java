package method_Overriding;

public class Class2 extends Class1{
	
	@Override
	public void m1()
	{
		System.out.println("Hellooooooooo");
	}
	
	public static void main(String[] args) {
		
		Class1 c = new Class2();
		
		Class2 c2 = (Class2)c;
		
		c2.m1();
	}

}
