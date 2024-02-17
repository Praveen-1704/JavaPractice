package object_methods;

public class To_Equals {
	
	
	String name;
	
	int age;

	@Override
	public boolean equals(Object obj)
	{
		To_Equals e = (To_Equals)obj;
		
		return this.name==e.name && this.age==e.age;
	}
	
	public To_Equals(String name, int age) {
		
		this.name=name;
		
		this.age=age;
	}
	
	public static void main(String[] args) {
		
		To_Equals T = new To_Equals("bala",21);
		
		To_Equals T1 = new To_Equals("bala",21);
		
		System.out.println(T.equals(T1));
	}
}
