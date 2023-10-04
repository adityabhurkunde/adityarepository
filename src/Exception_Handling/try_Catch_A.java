package Exception_Handling;

public class try_Catch_A
{

	public static void main(String[] args) 
	{

		String s = "Aditya";
		try
		{
			System.out.println(s.charAt(18));
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
		
	}

}
