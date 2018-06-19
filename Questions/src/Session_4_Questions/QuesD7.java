package Session_4_Questions;

import java.util.Scanner;

public class QuesD7 {

	public static void main(String[] args) 
	{
		int n;
		@SuppressWarnings("resource")
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter length of array:");
		n = SC.nextInt();
		
		float arr[] = new float[n];
		System.out.println("Enter values:");
		for(int i=0;i<n;i++)
		{
			arr[i] = SC.nextFloat();
		}
		for(int j=n;j>0;j--)
		{
			System.out.println(arr[j-1]);
		}

	}

}
