package methodOverloading;

public class MethodOverloading {
	
	public void m1()
	{
		System.out.println("No Argument Method");
	}
	
	public void m1(int a)
	{
		System.out.println(a);
	}
	
	public void m1(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void m1(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading M = new MethodOverloading();
		
		M.m1(12,"Kia");
		
		
	}

}
