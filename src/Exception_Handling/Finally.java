package Exception_Handling;

public class Finally
{

	public static void main(String[] args) 
	{
		String s = "Aaliya Bhatt";
		
		try
		{
			System.out.println(s.charAt(7));
		}
		
		finally 
		{
			System.out.println("This code is always going to excute ");
		}

	}

}
