package Method;

public class Para_Method 
{
  public void add(int x)       // method with argument
  {
	  System.out.println (x);
  }
  public static void main (String[]arg)
  {
	  Para_Method obj = new Para_Method();        // create of object
	  
	  obj.add(10);                   // reference of object to call method
			  
  }
}
