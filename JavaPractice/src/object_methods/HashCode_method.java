package object_methods;

import java.util.Objects;

public class HashCode_method {
	
	
	String name ="bala";
	
	@Override
	public int hashCode()
	{
		return Objects.hash(name);
	}
	
	
	
	public static void main(String[] args) {
		
		HashCode_method h = new HashCode_method();
		
		System.out.println(h.hashCode());
		
		
		
	}
}
