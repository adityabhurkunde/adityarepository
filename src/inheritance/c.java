package inheritance;

public class c extends p
{
	public void bike ()
	{
		System.out.println("GSA1250");
	}
	

	public static void main(String[] args)
	{
    
		 c obj = new c();
		 obj.property();
		 obj.car();
		 obj.bike();
		 
	}

}
