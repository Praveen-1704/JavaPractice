package UpcastingAndDowncasting;

public class Class2 extends Class1{
	
	String Gender = "male";
	
	String emailId = "bala@gmail.com";
	
	public static void main(String[] args) {
		
		Class1 c =new Class2();// Upcasting
		
		Class2 c2 = (Class2)c;
		
		
		System.out.println(c.name);
		
		System.out.println(c.age);
		
		System.out.println(c2.Gender);
		
		System.out.println(c2.emailId);
		
		
		
	}

}
