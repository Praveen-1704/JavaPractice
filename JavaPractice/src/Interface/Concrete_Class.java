package Interface;

public class Concrete_Class  extends abstraction.Concrete_Class implements Interface_implementation{

	
	public void m1()
	{
		System.out.println("Implementation is given for m1 Method");
	}
	
	public static void main(String[] args) {
		
		
		Interface_implementation I = new Concrete_Class();
		
		I.m1();
		
		I.m2();
				
		
		
		
	}
}
