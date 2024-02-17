package superCallStatement;

public class Class2 extends Class1{
	
	String gender;
	
	public Class2(String name, int age,String gender) {
		
		super(name,age);
		this.gender=gender;
	}

	
	public static void main(String[] args) {
		
		Class2 c = new Class2("bala",21,"male");
		
		Class2 c1 = c;
		
		System.out.println(c1.name);
		
		System.out.println(c1.age);
		
		System.out.println(c1.gender);
	}
}
