package Loopinjava;

public class User_method 

{
	public void add()    // this is user define method
	{
		System.out.println(" I am Aditya");
	}
	
	public static void main (String[]args)
	{
		 User_method a = new User_method ();     // Classname obj = new method name // creation of object
		 
		 a.add();        // obj.define method name // call the method by object reference
		 a.add();
	}
}