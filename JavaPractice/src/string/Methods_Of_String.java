package string;

public class Methods_Of_String {
	
	public static void main(String[] args) {
		
		
		String name = "Elephants";
		
		String name1="  Ele";
		
		System.out.println(name.length());
		
		System.out.println(name.contains("le"));
		
		System.out.println(name.substring(3));
		
		System.out.println(name.substring(3,8));
		
		System.out.println(name.indexOf('p'));
		
		System.out.println(name.indexOf('e',1));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name1.isEmpty());
		
		
		System.out.println("===============================");
		
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i)+" ");
		}
		System.out.println();
		
		System.out.println(name1.length());
		
		name1 = name1.trim();
		
		System.out.println(name1.length());
		
		}

}
