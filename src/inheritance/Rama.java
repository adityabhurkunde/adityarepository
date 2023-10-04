package inheritance;

public class Rama extends Dashratha
{
	public void C1()
	{
		System.out.println("Child_1 method");
	}
	
	public static void main (String[]args)
	{
		Rama obj = new Rama();
		obj.C1();
		
		obj.M1();
	}

}
