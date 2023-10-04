package Polymorphism;

public class Overriding_child extends Overriding_parent

{
	public void marry()               // method overriding 
	{
		System.out.println("Alia");
	}

	public static void main(String[] args) 
	
	{

		Overriding_child obj = new Overriding_child();
		obj.property();
		obj.marry();                            // method overriding 
		
		
	}

}
