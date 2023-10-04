package Array_Single_Dimentional;

import java.util.Arrays;

public class Array_A 
{

	public static void main(String[] args)
	{
		String s[] = {"Audi","BMW","TATA","Maruti","Tesla"};
		
		
		/////////////////////     1    Approach           /////////      
		
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
