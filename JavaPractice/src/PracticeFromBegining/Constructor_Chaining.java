package PracticeFromBegining;

public class Constructor_Chaining {
	
	String name;
	
	int age;
	
	String location;

	public Constructor_Chaining(String name,int age) {
		
		this.name=name;
		this.age=age;
	}
	
	
	public Constructor_Chaining(String name, int age, String location) {
		
		this(name,age);
		
		this.location=location;
		
	}
	
	public static void main(String[] args) {
		
		Constructor_Chaining c = new Constructor_Chaining("bala",21, "bangalore");
		
		System.out.println(c.name);
		
		System.out.println(c.age);
		
		System.out.println(c.location);
	}
	
}
