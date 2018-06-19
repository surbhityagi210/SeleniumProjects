package Session_4_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class QuesD8 {

	public static void main(String[] args) 
	{
		int n;
		@SuppressWarnings("resource")
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter length of array:");
		n = SC.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter values:");
		for(int i=0;i<n;i++)
		{
			arr[i] = SC.nextInt();
		}

		Arrays.sort(arr);
		System.out.println("Sorted array is:" + Arrays.toString(arr));
	}

}
