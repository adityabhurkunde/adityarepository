package Method;

public class method_2 
{

	public void add(int x)         // method 1
	{
		System.out.println(x);
		
	}
	
	public void add (int y , int z)      // Method 2
	{
		System.out.println (y+z);
		
	}
	
	public void add(String s)
	{
		System.out.println(s);
	}
	
	public static void main (String[]args)
	{
		method_2 obj = new method_2();
		obj.add(100);
		
		obj.add(20,40);
		
		obj.add("Aditya");
	}
	
}

