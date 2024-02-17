package exception;

public class Exception_class {
	
	
	public static void division(int a,int b) throws Exception
	{
		System.out.println(a/b);
	}
	
	
	public static void m1(int i) throws Not_In_The_Line_Exception
	{
		if(i<18)
		{
			throw new Not_In_The_Line_Exception();
		}
		else
		{
			System.out.println("Stand in the Line");
		}
	}
	
	
	public static void main(String[] args) throws Not_In_The_Line_Exception{
		
		
//		int a=10;
//		
//		int b=0;
//		
//		
//		try
//		{
//			System.out.println(a/b);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Get Message Method: "+e.getMessage());
//			
//			e.printStackTrace();
//		}
		
		try
		{
			division(10,2);
		}
		
		catch(Exception e)
		{
			System.out.println("Can not divide by 0");
		}
		
		System.out.println("===================================");
		
		int i=19;
		if(i<18)
		{
			throw new Not_In_The_Line_Exception();
		}
		else
		{
			System.out.println("Stand In the Line");
		}
		
		System.out.println("========================================");
		
		m1(14);
		
		
	}

}
