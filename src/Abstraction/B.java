package Abstraction;

public class B extends A
{
	
  public void M1()                   // take same name of parent method
  {
	  System.out.println("I am implemented ");
	  
  }
  
  public void M2()
  {
	  System.out.println("I am also implemented");
  }
  public static void main (String[]args)
  {
	   B obj = new B();
	   obj.M1();
	   obj.M2();
	   obj.M3();                    // normal class 
	   
  }
  
}

