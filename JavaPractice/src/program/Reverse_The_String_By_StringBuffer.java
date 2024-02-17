package program;

public class Reverse_The_String_By_StringBuffer {
	
	
	public static void main(String[] args) {
		
		String name="RAMA";
		
		StringBuffer S = new StringBuffer(name);
		
		S.reverse();
		
		System.out.println(S);
	}

}
