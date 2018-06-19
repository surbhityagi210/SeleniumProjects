package Session_4_Questions;

import java.util.Scanner;

public class QuesD3 {

	public static void main(String[] args)
	{
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		int arr3[] = new int[10];
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter array 1 data:");
		
		for(int i=0;i<10;i++)
		{
			arr1[i] = SC.nextInt();
		}
		
		System.out.println("Enter array 2 data:");
		for(int j=0;j<10;j++)
		{
			arr2[j]= SC.nextInt();
		}
		
		System.out.println("Subtract of two arrays are:");
		for(int k=0;k<10;k++)
		{
			arr3[k] = (int) (arr1[k]-arr2[k]);
			System.out.println(arr3[k]);
		}

		
	}

}
