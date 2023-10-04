package inheritance;

public class Bharat extends Dashratha 
{
	public void c3()
	{
		System.out.println(" child 3 method");
	}

	public static void main(String[] args)
	{
		
    
		Bharat obj = new Bharat();
		obj.c3();
		
		obj.M1();
	}

}
