package string;

public class New_Keyword {

	public static void main(String[] args) {
		
		String s1 = new String("Happy");
		
		String s2 = new String("Moring");
		
		String s3 = new String("Happy");
		
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3));
		
		
	}
}
