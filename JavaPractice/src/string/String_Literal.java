package string;

public class String_Literal {
	
	public static void main(String[] args) {
		
		String s1 = "Happy";
		
		String s2 = "Morning";
		
		String s3 = "Happy";
		
		System.out.println(s1==s3);  // Address 
		
		System.out.println(s1.equals(s3));  // value
	}

}
