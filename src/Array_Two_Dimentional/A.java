package Array_Two_Dimentional;


public class A
{

	public static void main(String[] args)
	{
		int a[][]= {{10,20,30,40},{50,60,70,80}};            //       2-D Array
		
		System.out.println(a.length);                 
		
		System.out.println(a[0].length);                     // 1 - array
		
		System.out.println(a[0][0]);                  //  10
		
		System.out.println();
		
		for (int i=0;i<a.length; i++)                // only inner loop
		{
			for (int j=0;j<a.length; j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		

	}

}
