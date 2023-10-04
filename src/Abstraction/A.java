package Abstraction;

public  abstract  class A 
{

	public abstract void M1();        // abstract method  [ necessary to give abstract keyword when class is abstract]
	
	public abstract void M2();               // ; for no body 
	
	public void M3()                 // normal method
	{
		System.out.println("I have normal method no need to implement me in child class ");
	}
	
	
}