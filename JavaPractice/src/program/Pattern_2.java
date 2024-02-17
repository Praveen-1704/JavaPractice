package program;

public class Pattern_2 {
	
	public static void main(String[] args) {
		
		int num=10;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i<=j)
				{
					System.out.print(num+" ");
					num--;
				}
				else
				{
					System.out.print(" "+" ");
				}
					
			}
			System.out.println();
		}
	}

}
