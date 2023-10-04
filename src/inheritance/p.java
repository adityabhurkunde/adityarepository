package inheritance;

public class p 
{
   public void property()
   {
	   System.out.println("Land and gold");
   }
   
   public void car()
   {
	   System.out.println("BMW");
   }
   
   public static void main (String[]args)
   {
	   p obj = new p ();
	   obj.property();
	   obj.car();
   }
}
 