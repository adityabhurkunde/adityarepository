package Method;

public class Para_method_2
{

	public void M1(int x)         // method 1
	{
		System.out.println(x);
		
	}
	
	public void M2 (int y , int z)      // Method 2
	{
		System.out.println (y+z);
		
	}
	
	public void M3(String s)
	{
		System.out.println(s);
	}
	
	public static void main (String[]args)
	{
		Para_method_2 obj = new Para_method_2();
		obj.M1(100);
		
		obj.M2(20,40);
		
		obj.M3("Aditya");
	}
	
}

