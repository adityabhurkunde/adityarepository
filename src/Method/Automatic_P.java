package Method;

public class Automatic_P
{
  public void add (int x)
  {
	  System.out.println (x);
  }
  
  public void add(Float f)
  {
	 System.out.println(f);
  }
  
  
  public static void main (String[]args)
  {
	  Automatic_P obj = new Automatic_P();
	  obj.add(20);  
	  obj.add('a');    // because of automatic promotion       //  char - ascii code -97
//	  obj.add(10.5);  error - reverse conversion int to float not possible (Data loss) 
	  
	  obj.add(10.10f);
	  obj.add('k');
  }
}


