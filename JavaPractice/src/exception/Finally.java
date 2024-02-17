package exception;

public class Finally {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block Ecxecuted");
		}
	}

}
