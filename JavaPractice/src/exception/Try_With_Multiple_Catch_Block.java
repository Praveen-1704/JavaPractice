package exception;

public class Try_With_Multiple_Catch_Block {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
