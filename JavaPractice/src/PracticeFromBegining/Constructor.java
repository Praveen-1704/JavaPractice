package PracticeFromBegining;

public class Constructor {
	
	String name;
	int age;
	
	public Constructor() {
		
		System.out.println("Non Parameterized Constructor");
	}
	
	
	Constructor(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	
	public String toString()
	{
		return name+" "+age;
	}
	
	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		
		Constructor c1 = new Constructor("Bala",21);
						
		System.out.println(c1.name);
		
		System.out.println(c1.age);
		
		System.out.println(c1);
		
		
		
		
	}

}
