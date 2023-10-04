package inheritance;

public class Rishikapoor extends Rajkapoor
{
      public void Karz()
      {
    	  System.out.println("Om Shanti Om ");
      }
      
      public static void main (String[]args)
      {
    	  Rishikapoor obj = new Rishikapoor ();
    	  
    	  obj.Karz();                    // self property 
    	  
    	  obj.meranaamjoker();           //  parent property
      }
	
}
