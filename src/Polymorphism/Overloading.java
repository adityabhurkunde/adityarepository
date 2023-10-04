package Polymorphism;

public class Overloading 
{

	public void add(int x)
	{
		System.out.println(x);
	}
	
	public void add(int x , int y)
	{
		System.out.println(x+y);
	}
	
	public void add(String s)
	{
		System.out.println("Aditya");
	}

	public void add(float f )
	{
		System.out.println (12.0);
	}
	
	public static void main(String[] args)
	{
	
		Overloading obj = new Overloading();
		obj.add(20);
		obj.add(1,2);
		obj.add("Adi");
		obj.add(10);
		

	}

}
