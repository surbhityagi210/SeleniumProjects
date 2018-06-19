package Session_4_Questions;

import java.util.Scanner;

public class QuesD16 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		int n=0;
		int del;
		int count=0;
		System.out.println("Enter the length of array:");
		n = SC.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the values of array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=SC.nextInt();
		}
		
		System.out.println("Enter the element to delete:");
		del=SC.nextInt();
		
		for(int j=0;j<n;j++)
		{
			if(arr[j]==del)
			{
				for(int k=j;k<(n-1);k++)
				{
					arr[k]=arr[k+1];
				}
				count++;
				break;
			}
		}
			if(count==0)
			{
				System.out.println("Element not found.");
			}
				
			else
			{
				System.out.println("Element deleted successfully.");
				System.out.println("New array is:");
				for(int i=0;i<(n-1);i++)
				{
					System.out.print(arr[i]+" ");
				}
			}

	}

}
