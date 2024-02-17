package Interface;

public interface Interface_implementation {
	
	public void m1();
	
	public default void m2()
	{
		System.out.println("Non-Static");
	}
	
	public static void m3()
	{
		System.out.println("Static Mehtod");
	}
	
	

}
