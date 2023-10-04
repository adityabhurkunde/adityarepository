package Abstraction;

public class g implements D
{

	public void M1()
	{
		System.out.println("I am implements of m1");
		
	}
	
	public void M2()
	{
		System.out.println("I am implements of m2");
		
	}
	

	public static void main (String[]args)
	{
		g obj = new g ();
		obj.M1();
		obj.M2();
	}
}
