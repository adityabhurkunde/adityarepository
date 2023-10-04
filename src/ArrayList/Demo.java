package ArrayList;

import java.util.ArrayList;

public class Demo
{

	public static void main(String[] args) 
	{
		ArrayList<Integer>obj=new ArrayList<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(30);
		
		
		System.out.println(obj);
		
		System.out.println(obj.size());               // length of array
		
		System.out.println(obj.get(1));                  // to retrieve value of index position
		
		obj.add(66);                                    //  add new integer in array
		
		System.out.println(obj);
		
		obj.remove(3);                                    // to delete or remove the 4 position of index value
		System.out.println(obj);                         
		
		
		obj.add(0, 7);                              // add in 0 index position 7 integer value
		System.out.println(obj);     
		
		
		System.out.println(obj.contains(30));                // check the integer value present in array or not.
		
		
		
		
		/////////////          for loop      //////////////
		for (int i = 0; i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		System.out.println();
		
		///////            for each loop            //////////
		
		for (int k : obj)
		{
			System.out.println(k);
		}
		
		

	}

}
