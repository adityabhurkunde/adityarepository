package Polymorphism;

public class Overriding_parent
{

	public void property()
	{
		System.out.println("Land + money + Gold ");
		
	}
	
	public void marry()
	{
		System.out.println("Dipika");    // overriden 
		
	}
	
	public static void main (String[]args)
	{
		Overriding_parent obj = new Overriding_parent();
		
		obj.property();          // self call method 
		obj.marry();            // self call method               normal 
	}
}