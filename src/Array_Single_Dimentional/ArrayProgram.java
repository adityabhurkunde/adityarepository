package Array_Single_Dimentional;

import java.util.Arrays;

public class ArrayProgram 
{

	public static void main(String[] args) 
	{

		int a[]= {10,20,30,40};
		
		System.out.println(Arrays.toString(a));               // 1 approach
		
		System.out.println(a[0]);            // Index position wise
		
		System.out.println(a[2]);
		
		System.out.println(a.length);         // length of array
		
		a[0]=50;                  // replace 
		
		System.out.println(Arrays.toString(a));
		
		System.out.println();        // for space
		
		/////////////////              2 Approach              /////////////////////////////////
		
		
		for (int i=0; i<a.length; i++)                                // 2 approach ( for loop )
		{
			System.out.println(a[i]);
		}
			
		System.out.println();
		
		///////////////////////         3 Approach            ////////////////////////////
		
		
		for (int k : a)                          // for each loop 
		{
			System.out.println(k);
		}
	}

}
