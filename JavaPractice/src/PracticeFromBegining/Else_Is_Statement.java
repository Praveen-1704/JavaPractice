package PracticeFromBegining;

public class Else_Is_Statement {

	public static void main(String[] args) {
		
		int a=8;
		
		if(a==0)
		{
			System.out.println("Numer is Zero");
		}
		else if(a<5)
		{
			System.out.println("Number is Less than 5");
		}
		else if(a>5 && a<10)
		{
			System.out.println("Number Between 5 and 10");
		}
		else
		{
			System.out.println("Number more thn or equal to 10");
		}
	}
}
