package program;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num=323;
		int temp=num;
		int reverse=0;
		
		while(num>0)
		{
			int digit = num%10;
			num=num/10;
			reverse=(reverse*10)+digit;
		}
		
		if(reverse==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(temp);
			System.out.println(reverse);
			System.out.println("Not palindrome");
		}
	}

}
