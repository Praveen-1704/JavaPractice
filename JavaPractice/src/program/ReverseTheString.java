package program;

public class ReverseTheString {
	
	public static void main(String[] args) {
		
		
		String name ="Sanjeev";
		
		String name1 ="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			name1=name1+name.charAt(i)+" ";
		}
		
		System.out.println(name1);
	}

}
