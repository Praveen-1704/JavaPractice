package Has_A_Relationship;

public class Dependent_Class {
	
	String name ;
	
	double price;
	
	Normal_Class N;
	
	public Dependent_Class(String name, double price, Normal_Class N) {
		
		this.name=name;
		
		this.price=price;
		
		this.N=N;
	}
	
	
	public static void main(String[] args) {
		
		Dependent_Class d = new Dependent_Class("KIA",120000,new Normal_Class(30));
		
		System.out.println(d.name);
		
		System.out.println(d.price);
		
		System.out.println(d.N.mileage);
	}

}
