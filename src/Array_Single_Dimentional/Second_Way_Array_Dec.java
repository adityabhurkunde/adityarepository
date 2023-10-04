package Array_Single_Dimentional;

import java.util.Arrays;

public class Second_Way_Array_Dec
{

	public static void main(String[] args) 
	{
		
		String a[]= new String[4];                // Array Declaration           // 4 is length
		
		a[0]="varun Dhavan";
		a[1]="Shahid Kapoor";
		a[2]="Aatif Aslam";
		a[3]="Aliya Bhatt";
		
		System.out.println(Arrays.toString(a));	           //  1 Approach
		
		System.out.println();
		for (int i= 0; i<a.length; i++)                        // 2 Approach
		{
			System.out.println(a[i]);                           
		}
		
		System.out.println();
		
		for (String k:a)                              // 3 Approach 
		{
			System.out.println(k);
		}
	}

}
