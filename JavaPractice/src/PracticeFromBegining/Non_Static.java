package PracticeFromBegining;

public class Non_Static {
	
	
	
	{
		System.out.println("Non-static intializer");
	}
	
	int a=10;
	
	public void m1()
	{
		System.out.println("Non static Method");
	}
	
	public static void main(String[] args) {
		
		Non_Static n = new Non_Static();
		
		System.out.println(n.a);
		
		n.m1();
	}

}
