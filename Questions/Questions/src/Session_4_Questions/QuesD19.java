package Session_4_Questions;

import java.util.Scanner;

public class QuesD19 {

	public static void main(String[] args) {
		int n=0;
		int index;
		int element;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter length of array:");
		n=SC.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=SC.nextInt();
		}
		System.out.println("Enter the index:");
		index = SC.nextInt();
		System.out.println("Enter the element to insert at given index:");
		element = SC.nextInt();
		for(int j=0;j>index;j++)
		{
			arr[j]=arr[j-1];
			
		}
		arr[index]=element;
		System.out.println("New array is:");
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
