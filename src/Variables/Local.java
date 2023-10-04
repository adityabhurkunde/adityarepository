package Variables;

public class Local {
	public void M1()
	{
		int x = 10 ;                           // Local Variable 
		System.out.println(x);
	}
     
	 public static void main (String[]args)
	 {
		 Local obj = new Local();
		 obj.M1();
	 }
}
