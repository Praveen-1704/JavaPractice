package PracticeFromBegining;

public class Methods {
	
//	public static int m1(int a)
//	{
//		System.out.println("Static Method Executed");
//		return a;
//	}
//	
//	public static void main(String[] args) {
//		
//		System.out.println(m1(10));
//	}
	
	
	public int m1(int a)
	{
		System.out.println("Non-static Method Executed");
		return a;
	}
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		
		System.out.println(m.m1(10));
	}
	
	

}

