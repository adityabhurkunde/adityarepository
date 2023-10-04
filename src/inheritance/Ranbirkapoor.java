package inheritance;

public class Ranbirkapoor extends Rishikapoor 
{
	public void Brahmastra()
	{
		System.out.println("Kesariya");
	}
	
	public void Tamasha()
	{
		System.out.println("Tum sath ho ");
	}
	
	public static void main (String[]args)
	{
		Ranbirkapoor obj = new Ranbirkapoor();
		obj.Brahmastra();                           // self property 
		obj.Tamasha();                               // self property
		
		obj.Karz();                             // call method of child_1
		
		obj.meranaamjoker();                      // call method of parent 
	}

}
     