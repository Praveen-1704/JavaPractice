package program;

public class Prime_number {

	public static void main(String[] args) {
		
		int num =2;
		int count=0;
		for(int i=1;i<=5;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("Non-prime Number");
		}
	}
}
