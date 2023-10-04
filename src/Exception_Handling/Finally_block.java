package Exception_Handling;

public class Finally_block 
{

	public static void main(String[] args)
	{
		String s = "Aaliya Bhatt";
		
		try
		{
			System.out.println(s.charAt(17));
		}
		
		catch(Exception e)
		{
			System.out.println("index value execute ");
		}
	
		finally 
		{
			System.out.println("This is always going to execute ");
		}

	}

}
