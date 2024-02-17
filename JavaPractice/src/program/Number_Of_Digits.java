package program;

public class Number_Of_Digits {
	
	public static void main(String[] args) {
		
		int num=256;
		int count=0;
		int sum=0;
		int pro=1;
		while(num>0)
		{
			int digit = num%10;
			num=num/10;
			sum+=digit;
			pro*=digit;
			count++;
		}
		
		System.out.println("Count: "+count);
		System.out.println("Sum of the digits: "+sum);
		System.out.println("Product of the digits: "+pro);
	}

}
