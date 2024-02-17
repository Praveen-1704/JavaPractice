package program;

public class Remove_Duplicates_From_String {
	
	public static void main(String[] args) {
		
		String s1="elephantspineapple";  //htsi
		
		String s2="";
		
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
				
//				if(count==1)                  // To get the unique char
//				{              
//					System.out.println(s1.charAt(i));
//				}
				
				if(count>1)                  // To get the duplicate Char
				{
					System.out.println(s1.charAt(i));
				}
				
				s2=s2+s1.charAt(i);
			}
		}
	}

}
