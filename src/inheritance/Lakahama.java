package inheritance;

public class Lakahama  extends Dashratha
{
    public void C2()
    {
    	System.out.println("Child2 method");
    }
	
	public static void main(String[] args)
	{
         Lakahama obj = new Lakahama();
         obj.C2();
         
         obj.M2();
	}

}
