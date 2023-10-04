package Variables;

public class Ins
{
	 int x = 50;                   // instance variable
	 
	 public void I1()
	 {
		 System.out.println(x);
	 }

	 public static void main (String[]args)
	 {
		 Ins obj = new Ins();
		 
		 obj.I1();
		 
		 System.out.println (obj.x);          // By using object reference
				 
	 }
}
