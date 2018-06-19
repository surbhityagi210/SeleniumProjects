package Session_4_Questions;

import java.util.Scanner;

public class QuesD6 {

	public static void main(String[] args) 
	{
		int n;
		int secmax;
		int position = 0;
		int position1 =0;
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
		int max = secmax= arr[0];
		
		for(int j=0;j<n;j++)
		{
			if(arr[j]>max)
			{
				secmax = max;
				max = arr[j];
				position = j;
				position1=j;
				
			}
			else if(arr[j]>secmax)
			{
				secmax = arr[j];
				position1 = j;
				
			}
		}
		System.out.println("Largest number is:" + max + " "+"and its position :" + position);
		System.out.println("Second largest number is:" + secmax +" "+"and its position:" +position1);
	}

}
