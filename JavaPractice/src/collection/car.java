package collection;
import java.util.*;
public class car {
	String brand;
	String color;
	car(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	public String toString()
	{
		return brand+" "+color;
	}
	public static void main(String[] args)
	{
		LinkedHashMap<car,String>h=new LinkedHashMap<>();
		h.put(new car("Ferrari","white"),"FW");
		h.put(new car("Lamborgini","Red"),"LR");
		h.put(new car("BMW","Black"), "BB");
		h.put(new car("Audi","white"), "AW");
		System.out.println(h);
		
		
		Set<car>k=h.keySet();
		
		for(car c:k)
		{
			System.out.println(c+" "+h.get(c));
		}
	}

}
