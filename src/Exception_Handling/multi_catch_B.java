package Exception_Handling;

public class multi_catch_B 
{

	public static void main(String[]args)
	{
		try
		{
			System.out.println(10/0);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("NPE");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("AME");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOBE");
		}
		
	}
}

	