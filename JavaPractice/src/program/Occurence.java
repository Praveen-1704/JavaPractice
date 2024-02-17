package program;

public class Occurence {
	
	public static void main(String[] args) {
		
		String s1 ="pineapple";
		String s2 ="";
		for(int i=0;i<s1.length();i++)
		{
			int count=1;
			if(s2.indexOf(s1.charAt(i))==-1)
			{
				for(int j=i+1;j<s1.length();j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						count++;
					}
				}
				
				System.out.println(s1.charAt(i)+": "+count);
				s2=s2+s1.charAt(i);
				
				
			}
		}
	}

}
