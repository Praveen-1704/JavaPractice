package abstraction;

public class Concrete_Class extends Abstract_class{
	
	public void m1()
	{
		System.out.println("Hiiiiiiiiii");
	}
	
	public void m3()
	{
		System.out.println("jiiiiiiii");
	}
	
	
	
	
	
		public static void main(String[] args) {
			
			Abstract_class c = new Concrete_Class();
			
			c.m1();
						
			c.m3();
			
			
		}

}
