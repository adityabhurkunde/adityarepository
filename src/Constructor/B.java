package Constructor;

public class B 
{
	B(int x)
	{
		System.out.println(x);
	}
	B (int x , int y)                         // method overloading    same method name but different in parameter .
	{
		System.out.println(x+y);
	}
	
	public static void main(String[]args)
	{
		B obj = new B(7);
		
		B obj1 = new B(8);
		
		B obj3 = new B(2,4);
	}

}
