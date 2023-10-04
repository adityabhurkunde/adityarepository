package Method;

public class B
{
  public void Sub_1()          // user define method
  {
	  System.out.println (50-50);
  }

   public static void main (String[]args)
   {
	   B obj = new B();      // create of object
	   
	   obj.Sub_1();         // call the method by reference
   }
}
