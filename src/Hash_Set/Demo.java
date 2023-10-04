package Hash_Set;

import java.util.HashSet;

public class Demo 
{

	public static void main(String[] args)
	{
      HashSet <String>obj=new HashSet <String>();
		
		obj.add("Audi");
		obj.add("Bmw");
		obj.add("Maruti");
		obj.add("BMW");
		
		System.out.println(obj.size());
		
		obj.add("Ford");
		
		System.out.println(obj);
		
		obj.remove("BMW");
		
		
		System.out.println(obj);
		
		for(String k: obj)
		{
			System.out.println(k);
			
		}
		

	}

}
