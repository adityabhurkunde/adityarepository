package Variables;

public class Ins_1
{
	int A = 40;
	public void A1()
	{
	  System.out.println(A);	
	}

	public static void main(String[] args)
	{
		
		Ins_1 obj = new Ins_1();
		
		obj.A1();
		
		System.out.println(obj.A);        //   approach 2
		
		
	}

}
