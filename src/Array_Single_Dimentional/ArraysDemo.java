package Array_Single_Dimentional;

import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
String s[] = {"Audi","BMW","TATA","Maruti","Tesla"};
		
		
		/////////////////////     1    Approach           /////////      
		
		System.out.println(Arrays.toString(s));             
		
		System.out.println();
		
		
		System.out.println(s[0]);                    //  retrieve the index position value 
		
		System.out.println();
		
		System.out.println(s.length);                  //   length of array
		
		System.out.println();
		
		s[0]="Mahindra";                                // replace the index position 0 value from Audi to Mahindra.
		System.out.println(Arrays.toString(s));
		
	
		
		
		System.out.println();
		
		//////////////    2    Approach             ////////  (for loop)
		
		for (int i = 0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}

		System.out.println();
		
		//////////////////////   3 Approach     ////////  (for each  loop )
		
		
		for (String  b : s)
		{
			System.out.println(b);
		}

		 

	}

}
