package object_methods;

public class ToString_Method {
	
	
	String name;
	
	int age;
	
	
	public ToString_Method(String name, int age) {
		
		this.name=name;
		
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return name+" "+age;
	}
	
	
	public static void main(String[] args) {
		
		ToString_Method T = new ToString_Method("Bala",21);
		
		System.out.println(T);
	
		
		
	}

}
