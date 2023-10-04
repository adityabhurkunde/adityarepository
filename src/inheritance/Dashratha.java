package inheritance;

public class Dashratha 
{

	public void M1()
	{
		System.out.println("Parent method_1");
		
	}
	
	public void M2()
	{
		System.out.println("Parent method_2");
	}
	
	public static void main (String[]args)
	{
		Dashratha obj  = new Dashratha();
		
		obj.M1();
		obj.M2();
	}
}
