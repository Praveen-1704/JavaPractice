package program;

public class Fibinoccis_series {
	
	public static void main(String[] args) {
		
		int num=10;
		
		int a=0;
		int b=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=2;i<num;i++)
		{
			
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
